package com.example.projeto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
@Autowired
    private Produtoservice service;
@GetMapping
    public List<ProdutoEntiry>ListarTodos(){
    service.salvarProduto(produto);
    return (List<ProdutoEntiry>) ResponseEntity
            .status(HttpStatus.CREATED)
            .body(Map.of("Mensagem","Produto Autalizado com Sucesso!!"));
    }
    @PutMapping
}
