package org.example.pet;

import org.example.Livro.Livro;

public class Main {
    static void main() {

        Pet pet1 = new Pet("Trovão","Border collie", 5, "Alto","Comida Organica");
        Pet pet2 = new Pet("Tapioca","Vira-lata",2, "Medio","Ração Felina");

        System.out.println("\n MEU CACHORRO");
        System.out.println("Nome:" + pet1.getNome());
        System.out.println("Raça:" + pet1.getRaca());
        System.out.println("Idade:" + pet1.getIdade() + "Anos");
        System.out.println("Porte:" + pet1.getPorte());
        System.out.println("Alimentação" + pet1.getAlimentacao());

        System.out.println(pet2);

    }
}
