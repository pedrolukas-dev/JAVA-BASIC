package org.example.veiculo;

public class Veiculo {

    private String placa;
    private String cor;
    private int passageiros;
    private int tanque;
    private int velocidade;
    private int consumo;

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "consumo=" + consumo +
                ", velocidade=" + velocidade +
                ", tanque=" + tanque +
                ", passageiros=" + passageiros +
                ", cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }

    public Veiculo(String placa, String cor, int passageiros, int tanque, int velocidade, int consumo) {
        this.placa = placa;
        this.cor = cor;
        this.passageiros = passageiros;
        this.tanque = tanque;
        this.velocidade = velocidade;
        this.consumo = consumo;



    }

}

