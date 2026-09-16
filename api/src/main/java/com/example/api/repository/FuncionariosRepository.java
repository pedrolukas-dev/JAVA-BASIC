package com.example.api.repository;

import com.example.api.entity.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// A anotação @Repository avisa ao Spring que essa interface cuida do Banco de Dados
@Repository
public interface FuncionariosRepository extends JpaRepository<FuncionarioEntity, Long> {


}