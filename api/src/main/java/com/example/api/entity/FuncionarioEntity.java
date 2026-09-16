package com.example.api.entity;

import jakarta.persistence.*;

// 1. @Entity avisa que esta classe vai virar uma tabela no banco de dados
@Entity
// 2. @Table permite escolher o nome exato da tabela no MySQL
@Table(name = "funcionarios")
public class FuncionarioEntity {

    // 3. @Id diz que esse é o campo da Chave Primária
    @Id
    // 4. @GeneratedValue faz o ID ser Automático (1, 2, 3...) pelo banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private double salario;

    // --- DAQUI PARA BAIXO, SÃO OS GETTERS E SETTERS ---
    // (O Spring precisa deles para conseguir ler e gravar os dados)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}