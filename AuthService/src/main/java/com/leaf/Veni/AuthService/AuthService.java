package com.leaf.Veni.AuthService;



/**
 * @author : rusiru on 11/6/19.
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AuthService {

    public static void main(String[] args) {
        SpringApplication.run(AuthService.class, args);
    }
}
