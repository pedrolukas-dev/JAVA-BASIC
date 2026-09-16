package com.example.api.controller;

import com.example.api.entity.ClienteEntity;
import com.example.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 1. CORREÇÃO: Trocamos @Repository por @RestController
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<ClienteEntity> listarTodos(){
        return repository.findAll();
    }

    // 2. CORREÇÃO: Método POST completado!
    @PostMapping
    public ResponseEntity<ClienteEntity> criarCliente(@RequestBody ClienteEntity cliente) {

        ClienteEntity clienteSalvo = repository.save(cliente);

        // Retornamos o cliente salvo com sucesso (código 200 OK)
        return ResponseEntity.ok(clienteSalvo);
    }
}