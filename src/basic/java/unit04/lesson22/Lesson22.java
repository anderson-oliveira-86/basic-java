package basic.java.unit04.lesson22;

import basic.java.unit04.lesson21.Carro;
import basic.java.util.Util;

public class Lesson22 {

    public static void main(String[] args) {

        Util.printTitle("Orientação Objetos - Métodos estáticos");

        Automovel c1 = new Automovel("BMW",280);
        Automovel c2 = new Automovel("Mercedes",275);
        Automovel c3 = new Automovel("Audi",290);

        System.out.println("########### Velocidade limite estática original (250) ###########");
        c1.imprime();
        c2.imprime();
        c3.imprime();



        System.out.println(" - utilizando o método static getVelocidadeLimite : " + Automovel.getVelocidadeLimite() );
        System.out.println(" - utilizando o método static setVelocidadeLimite com 190 ");
        Automovel.setVelocidadeLimite(190);
        System.out.println(" - utilizando o método static getVelocidadeLimite : " + Automovel.getVelocidadeLimite() );
        System.out.println("\n########### Velocidade limite estática alterada com método estático(190) ###########");
        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
