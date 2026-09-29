package com.example.projeto.repository;

import com.example.projeto.entity.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity,Long> {
    Optional <FuncionarioEntity> findByemail (String nome);
}
