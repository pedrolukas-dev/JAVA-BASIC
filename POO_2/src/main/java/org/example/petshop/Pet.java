package org.example.petshop;

public class Pet {
    private String nome;
    private String idade;
    private String raca;
    private Cliente cliente;

    public Pet(String nome, String idade, String raca, Cliente cliente) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", raca='" + raca + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}
