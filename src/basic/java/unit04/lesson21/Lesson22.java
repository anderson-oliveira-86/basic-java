package basic.java.unit04.lesson21;

import basic.java.util.Util;

public class Lesson22 {
    public static void main(String[] args) {
        Util.printTitle("Orientação Objetos - Modificador static");

        Carro c1 = new Carro("BMW",280);
        Carro c2 = new Carro("Mercedes",275);
        Carro c3 = new Carro("Audi",290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("Alterando a variável estática Velocidade Limite da Classe");

        Carro.velocidadeLimite = 190;

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
