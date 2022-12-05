package com.pluralsight.conferenceMVC1.controller;

import com.pluralsight.conferenceMVC1.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname", defaultValue = "Nemanja")String firstname,
                        @RequestParam(value = "lastname", defaultValue = "Mitrovic")String lastname,
                        @RequestParam(value = "age", defaultValue = "22")int age){
        User user=new User();

        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(age);

        return user;
    }

}
