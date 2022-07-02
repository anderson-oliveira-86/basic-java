package basic.java.unit01;

import basic.java.util.Util;

public class Lesson06 {
    public static void main(String[] args) {
        Util.printTitle("Operadores de Atribuição");

        // +=
        int valueA = 20;
        valueA += 10; // valueA = valueA + 10;
        System.out.println("Resultado da soma utilizando\noperador de atribuição (+=): " + valueA + "\n");

        // -=
        int valueB = 20;
        valueB -= 10; // valueB = valueB - 10;
        System.out.println("Resultado da subtração utilizando\noperador de atribuição (-=): " + valueB + "\n");

        // *=
        int valueC = 20;
        valueC *= 10; // valueB = valueB * 10;
        System.out.println("Resultado da multiplicação utilizando\noperador de atribuição (*=): " + valueC + "\n");

        // /=
        int valueD = 20;
        valueD /= 10; // valueB = valueB / 10;
        System.out.println("Resultado da divisão utilizando\noperador de atribuição (/=): " + valueD + "\n");

    }
}
