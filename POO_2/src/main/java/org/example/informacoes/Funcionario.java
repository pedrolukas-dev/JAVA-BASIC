package org.example.informacoes;

public class Funcionario {

    private int id;
    private String Nome;
    private String salario;
    private Setor setor;
    private Sexo sexo;
    private int idade;

    public Funcionario(int id, String nome, String salario, Setor setor, Sexo sexo, int idade) {
        this.id = id;
        Nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", Nome='" + Nome + '\'' +
                ", salario='" + salario + '\'' +
                ", setor=" + setor +
                ", sexo=" + sexo +
                ", idade=" + idade +
                '}';
    }
}

