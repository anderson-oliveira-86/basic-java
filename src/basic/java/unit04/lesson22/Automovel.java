package basic.java.unit04.lesson22;

import basic.java.unit04.lesson21.Carro;

public class Automovel {

    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Automovel(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Automovel.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome +
                "\nVelocidade Máxima: " + this.velocidadeMaxima +
                "\nVelocidade Limite: " + Automovel.velocidadeLimite +
                "\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
