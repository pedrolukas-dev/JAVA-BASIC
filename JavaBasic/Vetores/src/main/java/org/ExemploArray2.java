package org;

import java.util.Scanner;

public class ExemploArray2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];

        for(int i = 0; i < 2; i++) {
            System.out.println("Digite a " + (i + 1) + " nota:");
        }

        System.out.println("\nExibindo as notas");
        for(double nota : notas) {
            System.out.println("nota: " + nota);
        }
    }

}