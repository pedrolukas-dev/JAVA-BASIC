package com.example.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
    @GetMapping("/")
    public String mensagem(){
        return "Bem-Vindo!";
    }
    @GetMapping ("/dev")
    public String nomeDev(){
        return "Feito por: joão kleber";
    }

    @GetMapping ("/Curso")
     public String ads(){
         return "Desenvolvimento De Sistema";
        }
    }

