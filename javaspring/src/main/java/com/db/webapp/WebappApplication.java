package com.db.webapp;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
//import com.db.webapp.Repository.*;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class WebappApplication {

/*  	@Autowired
	V2repo v2repo;
	V5repo v5repo; */
	
	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

} 