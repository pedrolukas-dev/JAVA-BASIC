package com.example.projeto.repository;

import com.example.projeto.entity.ClienteEntity;
import com.example.projeto.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutoEntity extends JpaRepository<ProdutoEntity,Long> {
    Optional<ClienteEntity> findBynome (String nome);
}