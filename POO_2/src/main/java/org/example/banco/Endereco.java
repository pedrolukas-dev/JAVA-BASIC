package org.example.banco;

public class Endereco {
    private String cidade;
    private String logadouro;
    private int numero;

    public Endereco(String cidade, String logadouro, int numero) {
        this.cidade = cidade;
        this.logadouro = logadouro;
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade='" + cidade + '\'' +
                ", logadouro='" + logadouro + '\'' +
                ", numero=" + numero +
                '}';
    }
}
