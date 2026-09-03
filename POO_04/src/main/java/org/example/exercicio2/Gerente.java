package org.example.exercicio2;

public class Gerente extends Cargodeconfianca implements Contratacao{
    @Override
    public void admitir(Funcionario funcionario) {

    }

    @Override
    public void demitir(Funcionario funcionario) {

    }

    public Gerente(Bonificacao bonificacao) {
        super(bonificacao);
    }

    @Override
    public double obterSalarioFinal() {
        return super.salarioBase * super.bonificacao.getValor();

    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + this.obterSalarioFinal() +
                '}';
    }
}
