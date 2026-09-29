package com.example.projeto.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Entity
@Table
@Repository
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FuncionarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String matricula;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private int idade;
    @Column(nullable = false)
    private int salario;


}
