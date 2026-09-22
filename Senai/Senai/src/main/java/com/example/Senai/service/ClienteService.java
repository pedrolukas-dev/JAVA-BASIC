package com.example.Senai.service;

import com.example.Senai.entity.ClienteEntity;
import com.example.Senai.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<ClienteEntity> listarTodos() {
        return repository.findAll();
    }

    public ClienteEntity salvarCliente(ClienteEntity cliente) { // Alterado para 'cliente' minúsculo

        // Corrigido para buscar o email do cliente, fechar os parênteses e checar se já existe
        if (repository.findByEmail(cliente.getEmail()).isPresent()) {
            // Mudança para uma exceção mais adequada e com a mensagem certa para essa validação
            throw new IllegalArgumentException("Email já cadastrado!");
        }

        return repository.save(cliente);
    }
}