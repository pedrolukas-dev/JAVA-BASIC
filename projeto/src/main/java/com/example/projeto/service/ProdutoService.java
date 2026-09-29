package com.example.projeto.service;

import com.example.projeto.entity.ProdutoEntity;
import com.example.projeto.repository.Produtorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private Produtorepository repository;

    public List<ProdutoEntity> listarTodosProdutos() {
        return repository.findAll();
    }

    public ProdutoEntity salvar(ProdutoEntity produto) {
        if (repository.findBy(produto.getNome()).isPresent()) {
            throw new IllegalArgumentException("Produto já cadastrado no sistema!");
        }
        return repository.save(produto);
    }
}