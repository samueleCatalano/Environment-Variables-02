package com.envvar02.EnvVar02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    Environment env;

    @GetMapping
    public String helloFrom(){
        return  env.getProperty("welcomeMsg.prod");
        //for test, set the profiles.active to test and server.port to 4000,
        // for prod, set the profiles.active to test, server.port to 5000 and write welcomeMsg.prod instead of welcomeMsg.test

    }
}
