package com.example.api_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")

    public String BoasVindos() {
        return "Seja Bem Vindo!";

    }
    @GetMapping("/Dev")
    public String Dev(){
        return "Feito por JUBILEU";
    }

}
