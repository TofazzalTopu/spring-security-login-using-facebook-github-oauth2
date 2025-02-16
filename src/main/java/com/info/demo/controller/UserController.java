package com.info.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping
public class UserController {


    @RequestMapping("/user")
    public Principal user(Principal principal) {
//        List list = ((UsernamePasswordAuthenticationToken) ((OAuth2Authentication) principal).userAuthentication).details;
        return principal;
    }



}
