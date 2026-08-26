package org.example.endereco;

public class Main {
    static void main() {
        Endereco endereco1 = new Endereco("04","Rua dos Alfeneiros","Londres");
        Cliente cliente = new Cliente("Harry potter",12, endereco1);

        System.out.println(cliente);
    }


}

