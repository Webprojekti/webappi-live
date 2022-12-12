package com.db.webapp.pwencoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Passwordencoder extends BCryptPasswordEncoder {
}
