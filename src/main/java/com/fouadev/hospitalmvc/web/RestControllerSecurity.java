package com.fouadev.hospitalmvc.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 Created by : Fouad SAIDI on 27/04/2024
 @author : Fouad SAIDI
 @date : 27/04/2024
 @project : hospital-mvc
*/
@RestController
public class RestControllerSecurity {
    @GetMapping("/profile")
    public Authentication authentication() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication;
    }
}