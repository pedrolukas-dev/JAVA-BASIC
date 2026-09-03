package org.example.exercicio2;

public class Motoboy extends Funcionario{
    @Override
    public double obterSalarioFinal() {
        return 0;
    }

    private String placadamoto;

    public Motoboy(String nome, String cpf, String dataDeNascimento, double salarioBase, String placadamoto) {
        super(nome, cpf, dataDeNascimento, salarioBase);
        this.placadamoto = placadamoto;
    }

    public String getPlacadamoto() {
        return placadamoto;
    }

    public void setPlacadamoto(String placadamoto) {
        this.placadamoto = placadamoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placadamoto='" + placadamoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + this.obterSalarioFinal() +
                '}';
    }
}
