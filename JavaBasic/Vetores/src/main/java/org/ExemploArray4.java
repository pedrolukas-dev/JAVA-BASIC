package org;

import java.util.Scanner;

public class ExemploArray4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];
        double soma = 0;

        for(int i = 0; i < 2; i++) {

            do {
                System.out.println("Digite a " + (i + 1) + "ª nota (0 a 10):");
                notas[i] = ler.nextDouble();


                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("Erro: A nota precisa ser entre 0 e 10! Tente novamente.\n");
                }

            } while (notas[i] < 0 || notas[i] > 10);

            soma = soma + notas[i];
        }

        System.out.println("\nExibindo as notas");
        for(double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        double media = soma / 2;
        System.out.println("\nFim do cálculo \nA média final é: " + media);

        ler.close();
    }

}