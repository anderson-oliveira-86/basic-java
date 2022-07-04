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

    }
}
