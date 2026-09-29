package com.example.projeto.controller;

import com.example.projeto.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Funcionario")
public class FuncionarioController {

@Autowired
private FuncionarioService service;

@GetMapping

    public List<FuncionarioService>

}
