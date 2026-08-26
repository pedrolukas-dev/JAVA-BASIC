package org.example.relacionamento_classe;

public class Main {
    static void main() {

        Pessoa pessoa = new Pessoa(1234,"Pedro","71-6546-5623","klasfjh@gmail.com",Sexo.MASCULINO,new Endereco("Rua ana Cristina","74","casa","40-785-4165","Salvador",UnidadeFederativa.BAHIA));
        System.out.println(pessoa);
    }
    
}
