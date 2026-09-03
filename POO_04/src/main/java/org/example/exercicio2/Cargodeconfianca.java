package org.example.exercicio2;

public abstract class Cargodeconfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public Cargodeconfianca(Bonificacao bonificacao) {
        super(nome, cpf, dataDeNascimento, salarioBase);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}
