package com.example.projeto.repository;

import com.example.projeto.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Produtorepository extends JpaRepository<ProdutoEntity,Long> {
}
