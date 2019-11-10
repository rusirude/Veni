package com.leaf.Veni.UserService;

/**
 * @author : rusiru on 11/4/19.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserService {

    public static void main(String[] args) {
        SpringApplication.run(UserService.class, args);
    }
}
