package OperadoresLogicos;

public class MetodosString {
    public static void main(String[] args){

        String nome = "Marta";
        String sobrenome = "Silveira";

        System.out.println("Tamanho do nome:");
        System.out.println("Tamanho do Sobrenome" + sobrenome.length());

        String nomecompleto = nome.concat(" ").concat(sobrenome);
        System.out.println("Concatenac~] ao Maiúsculo:"+ nomecompleto.toUpperCase());
        System.out.println("concatenac~] ao Minúsculo:"+ nomecompleto.toLowerCase());
    }


}

