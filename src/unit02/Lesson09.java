package unit02;

import util.Util;

public class Lesson09 {
    public static void main(String[] args) {
        Util.printTitle("Estruturas Condicionais - Operador ternário");

        // (Condição) ? Verdadeiro : False ;

        int valueA = 12;
        String resultA = (valueA >  10) ? "Value " + valueA + " é maior que 10" : "Value " + valueA + " é menor ou igual a 10" ;
        System.out.println(resultA);

        int valueB = 8;
        String resultB = (valueB >  10) ? "Value " + valueB + " é maior que 10" : "Value " + valueB + " é menor ou igual a 10" ;
        System.out.println(resultB);
    }
}
