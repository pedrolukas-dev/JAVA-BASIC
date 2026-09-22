package com.example.Senai.repository;

import com.example.Senai.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity,Long> {

    Optional<ClienteEntity> findEmail(String email);
}
