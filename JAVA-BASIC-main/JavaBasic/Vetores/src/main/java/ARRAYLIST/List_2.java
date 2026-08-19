package ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class List_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta;

        do {
            System.out.println("Digite uma nota:");
            notas.add(ler.nextDouble());

            System.out.println("Deseja inserir mais uma nota?");
            System.out.println("Pressione a tecla N para sair (ou qualquer outra para continuar):");
            resposta = ler.next();

        } while (!resposta.equalsIgnoreCase("n"));

        System.out.println("\n Exibindo as notas");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        ler.close();
    }
}