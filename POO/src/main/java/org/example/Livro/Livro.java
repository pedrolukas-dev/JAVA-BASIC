package org.example.Livro;

public class Livro {
    private String titulo;
    private String  autor;
    private int numeroDepaginas;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDepaginas() {
        return numeroDepaginas;
    }

    public double getPreco() {
        return preco;
    }

    public Livro(String titulo, String autor, int numeroDepaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDepaginas = numeroDepaginas;
        this.preco = preco;


    }
}
