package com.leaf.Veni.UserService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : rusiru on 11/4/19.
 */
@RestController
@RequestMapping("user")
public class Test {
    @GetMapping("/{name}")
    public String getUsername(@PathVariable("name") final String name){
        return "My name is "+name;
    }
}
