package org.example.animal;

public class Gato implements Animal{
    @Override
    public String emitirSom() {
        return "Maguou!!";
    }

    @Override
    public String comer() {
        return "rato";
    }
}
