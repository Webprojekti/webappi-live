package com.db.webapp.Controller;
import java.util.Base64;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.db.webapp.Repository.*;
import com.db.webapp.Service.SecurityService;
import com.db.webapp.model.*;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RestController
public class UserRestController {
    @Autowired
    SecurityService uRepo;
    @Autowired
    private V1arepo v1arepo;
    @Autowired
    private V1mrepo v1mrepo;
    @Autowired
    private V2repo v2repo;
    @Autowired
    private V3repo v3repo;
    @Autowired
    private V5repo v5repo;
    @Autowired
    private V6repo v6repo;
    @Autowired
    private V7repo v7repo;
    @Autowired
    private V7crepo v7crepo;
    @Autowired
    private V7trepo v7trepo;
    @Autowired
    private V8repo v8repo;
    @Autowired
    private V9repo v9repo;

    @PostMapping("/register")
    public ResponseEntity<String> register(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String email) {
        User u = uRepo.register(username, email, password);
        return new ResponseEntity<>(u.getUsername(), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(
            @RequestParam String username,
            @RequestParam String password) {
        String token = uRepo.login(username, password);

        if (token == null) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

        return new ResponseEntity<>(token, HttpStatus.OK);
    }

    @PostMapping("/delete")
    public String delete(
            @RequestParam String username,
            @RequestParam String password) {
        uRepo.delete(username, password);
        return null;
    }

    @GetMapping("/private")
    public ResponseEntity<String> getPrivateData(@RequestHeader("Authorization") String bearer) {

        if (bearer.startsWith("Bearer")) {
            String token = bearer.split(" ")[1];
            String username = uRepo.validateJwt(token);
            if (username != null) {
                return new ResponseEntity<>("Private data for " + username, HttpStatus.OK);
            }
        }

        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

    @PostMapping("/loginbasic")
    public ResponseEntity<String> loginBasic(@RequestHeader("Authorization") String basicAuth) {

        String token = null;
        // "Basic uname:pw"
        if (basicAuth.startsWith("Basic")) {
            String credentials = basicAuth.split(" ")[1];
            String[] user = new String(Base64.getDecoder().decode(credentials)).split(":");
            token = uRepo.login(user[0], user[1]);
        }

        if (token == null) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

        return new ResponseEntity<>(token, HttpStatus.OK);
    }


    @GetMapping("/v1m")
    List<V1m> datav1m() {
        return v1mrepo.findAll();
    }
    @GetMapping("/v1a")
    List<V1a> datav1a() {
        return v1arepo.findAll();
    }
    @GetMapping("/v2")
    List<V2> datav2() {
        return v2repo.findAll();
    }
    @GetMapping("/v3")
    List<V3> datav3() {
        return v3repo.findAll();
    }
    @GetMapping("/v5")
    List<V5> datav5() {
        return v5repo.findAll();
    }
    @GetMapping("/v6")
    List<V6> datav6() {
        return v6repo.findAll();
    }
    @GetMapping("/v7")
    List<V7> datav7() {
        return v7repo.findAll();
    }
    @GetMapping("/v7c")
    List<V7c> datav7c() {
        return v7crepo.findAll();
    }
    @GetMapping("/v7t")
    List<V7t> datav7t() {
        return v7trepo.findAll();
    }
    @GetMapping("/v8")
    List<Map<String,Object>> datav8() {
        return v8repo.getAllData();
    }
    @GetMapping("/v9")
    List<V9> datav9() {
        return v9repo.findAll();
    }

}


