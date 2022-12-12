package com.db.webapp.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.db.webapp.Repository.UserRepository;
import com.db.webapp.model.User;

@Service
public class SecurityService {
    
    @Autowired
    UserRepository repo;

    @Autowired
    PasswordEncoder myEncoder;

    @Value("${jwt.secret}")
    private String jwtKey;

    public User register(String username, String email, String pw){
        User u = new User(username, email, myEncoder.encode(pw));
        repo.save(u);
        return u;
    }
    public User delete(String username, String pw){
        User u = repo.findById(username).orElse(null);

        if(u == null || !myEncoder.matches(pw, u.getPassword()) ){
            return null;
        }
        repo.delete(u);
        return null;
    }


    public String login(String username, String pw){
     
        User u = repo.findById(username).orElse(null);

        if(u == null || !myEncoder.matches(pw, u.getPassword()) ){
            return null;
        }

        Algorithm alg = Algorithm.HMAC256(jwtKey);
        return JWT.create().withSubject(u.getUsername()).sign(alg);
    }

    public String validateJwt(String jwtToken){
        Algorithm alg = Algorithm.HMAC256(jwtKey);
        JWTVerifier verifier = JWT.require(alg).build();

        try {
            DecodedJWT jwt = verifier.verify(jwtToken);
            return jwt.getSubject();
        } catch (JWTVerificationException e) {
        }

        return null;
    }
}
