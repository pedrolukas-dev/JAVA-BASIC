package org.example.exercicio;

public enum Setor {
    RECURSOS_HUMANOS("Recursos Humanos"),
    FINANCEIRO("Financeiro"),
    OPERACAOES("Operações");

    private String nome;

    Setor(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }
}
