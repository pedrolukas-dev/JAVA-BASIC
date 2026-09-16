package com.example.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    // Primeira Rota
    @GetMapping("/")
    public String darBoasVindas() {
        return "Bem-vindo à minha API! O arquivo Welcome está funcionando.";
    }

    // Segunda Rota
    // Note que mudei o nome do método para 'mensagemDev'
    @GetMapping("/DEV")
    public String mensagemDev() {
        return "Feito por Jubila!.:";
    }
}