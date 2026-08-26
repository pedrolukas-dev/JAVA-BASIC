package org.example.endereco;

public class Endereco {
    private String numero;
    private String logadoro;
    private String cidade;

    public Endereco(String numero
            , String logadoro, String cidade) {
        this.numero
                = numero
        ;
        this.logadoro = logadoro;
        this.cidade = cidade;
    }

    public String getRua() {
        return numero
                ;
    }

    public void setRua(String numero
    ) {
        this.numero
                = numero
        ;
    }

    public String getLogadoro() {
        return logadoro;
    }

    public void setLogadoro(String logadoro) {
        this.logadoro = logadoro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;

    }

    @Override
    public String toString() {
        return "Endereco{" +
                "numero='" + numero + '\'' +
                ", logadoro='" + logadoro + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}

