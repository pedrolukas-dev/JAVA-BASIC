package org.example.petshop;

public class Main {
    static void main() {
        Cliente cliente1 = new Cliente("rony weasley"," Ottery St. Catchpole","11");
        Pet pet = new Pet("perebas","39","Rato de Esgoto",cliente1);
        System.out.println(pet);
    }

}
