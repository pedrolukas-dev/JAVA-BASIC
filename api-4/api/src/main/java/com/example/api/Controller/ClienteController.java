package com.example.api.Controller;


import com.example.api.Entity.ClienteEntity;
import com.example.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClienteController {


    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<ClienteEntity> listarTodos(){
        return  repository.findAll();
    }
    @PostMapping
    public ResponseEntity<Map<String,String>> Salvar(@RequestBody ClienteEntity cliente){
        repository.save(cliente);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem","Cliente Salvo com Sucesso!"));
    }
}
