package basic.java.unit06.lesson35;

import basic.java.util.Util;

public class Lesson35 {
    public static void main(String[] args) {
        Util.printTitle("Orientação Objetos - Polimorfismo pt 01 - Introdução");

        Tomate tomate = new Tomate("Italiano" ,5);
        CalculadoraService.calcularImposto(tomate);
        System.out.println("######################################################");
        Computador computador = new Computador("Intel" , 4000);
        CalculadoraService.calcularImposto(computador);

        System.out.print("\n");
        Util.printTitle("Orientação Objetos - Polimorfismo pt 03 - Parâmetros polimórficos");

        Produto produto1 = new Computador("Intel" , 4000);
        Produto produto2 = new Tomate("Italiano" ,5);
        Televisao televisao = new Televisao("fullHD" , 10000);
        System.out.println(produto1);
        System.out.println("######################################################");
        System.out.println(produto2);
        System.out.println("######################################################");
        System.out.println(televisao);

        Util.printTitle("Orientação Objetos - Polimorfismo pt 04 - Cast e instanceof");

        Tomate tomate1 = new Tomate("Alienigena" , 10);
        tomate1.setDataValidade("13/07/2022");


    }
}
