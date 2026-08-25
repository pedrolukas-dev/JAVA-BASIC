package org.example.Livro;

public class main {

    public static void main(String[] args) {

        Livro livro1 = new Livro("A ODISSEIA", "Homero", 576, 59.90);
        Livro livro2 = new Livro("O Diario de um Banana", "Jeff Kinney", 224, 49.78);

        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Número de Paginas: " + livro1.getNumeroDepaginas());
        System.out.println("Preço: " + livro1.getPreco());

        System.out.println("Titulo: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Número de Paginas: " + livro2.getNumeroDepaginas());
        System.out.println("Preço: " + livro2.getPreco());
    }
}