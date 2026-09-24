package com.example.projeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String BoasVindas(){
        return "Seja Bem vindo";

    }
    @GetMapping("/Dev")
    public String dev(){
        return "Feito por jubila";
    }
}
