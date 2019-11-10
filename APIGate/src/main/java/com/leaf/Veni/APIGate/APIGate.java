package com.leaf.Veni.APIGate;

/**
 * @author : rusiru on 11/4/19.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class APIGate {
    public static void main(String[] args) {
        SpringApplication.run(APIGate.class, args);
    }
}
