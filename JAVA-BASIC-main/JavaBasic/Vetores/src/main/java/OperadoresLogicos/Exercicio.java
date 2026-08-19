package OperadoresLogicos;

public class Exercicio {
    public static void main(String[] args){
        String nomeUsuario =  "Pedro";
        int senha =123456;

        boolean resultadoNome = nomeUsuario.equals("Pedro");
        boolean resultadoSenha = (senha == 123456);

        if (resultadoNome && resultadoNome){
            System.out.println("Bem-vindo, usario logado!"+ resultadoNome);
        }else {
            System.out.println("Nome de usuario e senha invalida"+resultadoSenha);

        }

    }
}
