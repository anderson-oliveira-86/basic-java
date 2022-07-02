package basic.java.unit04.lesson24;

import basic.java.util.Util;

public class Lesson24 {
    public static void main(String[] args) {
        Util.printTitle("Orientação Objetos - Associação (Arrays com Objetos)");

        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafu");

        Jogador[] jogadores = new Jogador[]{jogador1 , jogador2 , jogador3};

        for (Jogador jogador :
                jogadores) {
            System.out.println(jogador);
        }

    }
}
