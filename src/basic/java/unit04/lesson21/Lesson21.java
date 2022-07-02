package basic.java.unit04.lesson21;

import basic.java.util.Util;

public class Lesson21 {
    public static void main(String[] args) {
        Util.printTitle("Orientação Objetos - Modificador static");

        Carro c1 = new Carro("BMW",280);
        Carro c2 = new Carro("Mercedes",275);
        Carro c3 = new Carro("Audi",290);

        System.out.println("########### Velocidade limite estática original (250) ###########");
        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("\n########### Velocidade limite estática alterada com método estático(190) ###########");

        Carro.velocidadeLimite = 190;

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
