package org.example.animal;

public class Cachorro  implements Animal {

    @Override
    public String emitirSom() {
        return "AUau!";

    }

    @Override
    public String comer() {
        return "Carne";
    }
}

