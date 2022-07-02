package basic.java.unit04.lesson23;

import basic.java.util.Util;

public class Lesson23 {
    public static void main(String[] args) {
        Util.printTitle("Orientação Objetos - Bloco de inicialização estático");

        Serie serie1 = new Serie("Stranger Things");
        System.out.print("\n");
        Serie serie2 = new Serie("Breaking Bad");
        System.out.print("\n");
        Serie serie3 = new Serie("Game of thrones");
    }
}
