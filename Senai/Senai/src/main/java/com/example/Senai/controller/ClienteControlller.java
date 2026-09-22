package com.example.Senai.controller;

import com.example.Senai.entity.ClienteEntity;
import com.example.Senai.repository.ClienteRepository;
import com.example.Senai.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Clientes")
public class ClienteControlller {
@Autowired
    private ClienteService service;
@GetMapping
    public List<ClienteRepository> listarTodosClientes{
    return service.listarTodos();
    }
    @PostMapping
    ResponseEntity<Map<String>>Salvar(@RequestBody ClienteEntity cliente){
    service.salvarCliente(cliente);
    return  ResponseEntity
            .status(HttpStatus.CREATED)
            .body(Map.of("mensagem","Clientes com sucesso!))
    }
}
