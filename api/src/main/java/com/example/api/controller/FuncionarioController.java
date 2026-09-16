package com.example.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 1. A etiqueta fica AQUI, em cima da classe!
@RestController
// 2. Definimos que a URL base desse controller será /funcionarios
@RequestMapping("/funcionarios")
public class FuncionarioController {

    // 3. Aqui dentro criamos as rotas. Esse @GetMapping responde quando acessarem a URL.
    @GetMapping
    public String listarFuncionarios() {
        return "Sua rota de funcionários está funcionando! Em breve listaremos dados aqui.";
    }
}