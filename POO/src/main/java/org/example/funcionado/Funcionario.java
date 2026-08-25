package org.example.funcionado;

public class Funcionario {

    private String nome;
    private String cpf;
    private String dataDeNascimento;
    private String email;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public Funcionario(String nome, String cpf, String dataDeNascimento, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
   }

}

