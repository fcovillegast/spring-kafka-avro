package com.codenotfound.kafka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/main")
public class Main {


    @RequestMapping
    public String getMain() {
        return "Hola Mundo";
    }

}
