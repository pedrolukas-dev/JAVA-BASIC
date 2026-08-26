package org.example.banco;

import org.example.endereco.Endereco;

public class Main {

    public static void main(String[] args) {

        // Coloquei "Salvador" como a cidade na 3ª informação
        Endereco endereco1 = new Endereco("08", "Rua carla da fonseca", "Salvador");

        Conta banco1 = new Conta("Banco do Brasil", "Rio vermelho", "846.425.455.63", "1.875", "limite");
        Funcionario funcionario = new Funcionario("865", "Juvenal Negro", endereco1, "71-8597-5313","Jovenal.negro@gmail.com",banco1);

        System.out.println(funcionario);
    }
}