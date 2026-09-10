package com.example.api.entity;

import jakarta.persistence.*;

public class ClienteEntity {
    @Entity
    @Table (name = "tab_clientes")
    public  class ClientEntity {
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private String nome;
        @Column(nullable = false)
        private Long id;
        @Column(nullable = false)
        private String email;
        @Column(nullable = false)
        private String relefone;
        @Column(nullable = false)

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getRelefone() {
            return relefone;
        }

        public void setRelefone(String relefone) {
            this.relefone = relefone;
        }

        public ClientEntity(String nome, Long id, String email, String relefone) {
            this.nome = nome;
            this.id = id;
            this.email = email;
            this.relefone = relefone;

        }

    }

}
