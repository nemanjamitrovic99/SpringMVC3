package com.pluralsight.conferenceMVC1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")     //ovo mora da bude registration
    public String getRegistration(Map<String, Object> model){
        return "registration";          //i ovo mora da bude registration
    }
}
