package org.example.funcionado;

import org.example.Livro.Livro;

public class main {
    static void main(){
        Livro livro1 = new Livro("A ODISSEIA", "Homero", 576, 59.90);
        Funcionario funcionario1 = new Funcionario("izzi","789.456.132.08","15/08/2002","izzi@gmail.com");

        System.out.println("= DADOS DO LIVRO =");
        System.out.println("Título:" + livro1.getTitulo());
        System.out.println("Autor:" + livro1.getAutor());
        System.out.println("Número de Páginas:" + livro1.getNumeroDepaginas());
        System.out.println("Preço:" + livro1.getPreco());

        System.out.println("\n= DADOS DO FUNCIONÁRIO =");
        System.out.println("Nome:" + funcionario1.getNome());
        System.out.println("CPF" + funcionario1.getCpf());
        System.out.println("Data de Nascimento:" + funcionario1.getDataDeNascimento());
        System.out.println("E-mail:" + funcionario1.getEmail());

    }
}
