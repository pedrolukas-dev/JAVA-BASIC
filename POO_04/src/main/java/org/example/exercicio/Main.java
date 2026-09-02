package org.example.exercicio;

public class Main {
    static void main() {
        Motoboy motoboy = new Motoboy("Fredo","02/12/2006",Sexo.FEMININO,Setor.FINANCEIRO,3000,"7894531387");
        Diretor diretor = new Diretor("Fernando de Noronha","05/11/1968",Sexo.MASCULINO,Setor.OPERACAOES,7000);
        System.out.println(motoboy);
        System.out.println(diretor);


    }

}
