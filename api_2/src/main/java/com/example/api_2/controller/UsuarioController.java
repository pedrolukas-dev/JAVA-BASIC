package com.example.api_2.controller;


import com.example.api_2.entity.UsuarioEntity;
import com.example.api_2.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuariosRepository repository;

    @GetMapping
    public List<UsuarioEntity> listarTodos(){
        return repository.findAll();

    }

    @PostMapping
    public ResponseEntity<Map<String,Object>> salvar(@RequestBody UsuarioEntity usuario){
        repository.save(usuario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Usuario cadastrado com Sucesso!"));



    }
    @PutMapping
    public ResponseEntity<UsuarioEntity> atualizar(@RequestBody UsuarioEntity usuario) {
        UsuarioEntity usuarioAtualizado = repository.save(usuario);
        return ResponseEntity.ok(usuarioAtualizado);
    }
}
