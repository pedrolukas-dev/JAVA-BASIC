package org.example.animal;

public class Main {
    static void main() {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Pato pato = new Pato();
        Galo galo = new Galo();


        System.out.println("Cachorro: " + cachorro.emitirSom ()+ "\nCome: " + cachorro.comer());
        System.out.println("Gato: " + gato.emitirSom()+ "\nCome: " + gato.comer());
        System.out.println("Pato: " + pato.emitirSom()+ "\nCome: " + pato.comer());
        System.out.println("Galo: " + galo.emitirSom()+ "\nCome: " + galo.comer());

    }


}
