package com.example.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_cliente")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private String whatsapp;

    public ClienteEntity() {
    }

    public ClienteEntity(Long id, String nome, String email, String endereco, String whatsapp) {
        this.id = id;

        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.whatsapp = whatsapp;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    @Override
    public String toString() {
        return "ClienteEntity{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", whatsapp='" + whatsapp + '\'' +
                '}';
    }
}
