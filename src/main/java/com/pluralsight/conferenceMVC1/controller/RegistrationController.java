package com.pluralsight.conferenceMVC1.controller;

import com.pluralsight.conferenceMVC1.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")     //ovo mora da bude registration
    public String getRegistration(@ModelAttribute("registration")Registration registration){
        //ovo registration iz ModelAttribute se vezuje za registration iz registration.jsp stranice u tagu form
        return "registration";          //i ovo mora da bude registration
    }

    @PostMapping("registration")
    public String addRegistration(@ModelAttribute("registration")Registration registration){
        System.out.println("Registration: "+registration.getName());

        return "redirect:registration";
    }
}
