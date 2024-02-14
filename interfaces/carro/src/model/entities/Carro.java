package model.entities;

public class Carro implements Veiculo{
    private String name;
    private String placa;
    private Double velocidadeMaxima;

    public Carro() {
    }

    public Carro(String name, String placa, Double velocidadeMaxima) {
        this.name = name;
        this.placa = placa;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void ligar() {
        System.out.println("Ligando ...");
    }

    public void desligar() {
        System.out.println("Desligando ...");
    }

    public String toString() {
        return "Nome: " + name + ", Placa: " + placa + ", Velocidade Máxima: " + velocidadeMaxima;
    } 
}
