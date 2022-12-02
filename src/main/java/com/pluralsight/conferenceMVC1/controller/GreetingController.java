package com.pluralsight.conferenceMVC1.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping("greeting")         //ovde je vazno ovo ime greeting
    public String greeting(Map<String,Object> model) {          //ovde je nebitno koje cemo ime da damo metodi
        //ovo Map<String, Object> je da hocemo da kao parametar imamo Mapu a ta Mapa ce imati par string objekata
        model.put("message","Hello Nemanjaaaa1");     //ovo message je ono ${message} iz greeting.jsp
        return "greeting";
    }
    //ono sto ovo gore radi je da kad trazimo URL/greeting, pozvace ovaj metod, staviti ovu poruku u model
    //a onda ce return linija traziti jsp stranicu sa nazivom greeting
}
