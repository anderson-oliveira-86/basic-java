package unit01.lesson01;

import util.Util;

public class Lesson07 {

    public static void main(String[] args) {
        Util.printTitle("Operadores de incremento e decremento");

        int valueA = 10;
        System.out.println("Incrementando (variable++)\nValor inicial da variável: " + valueA);
        System.out.println(valueA++);
        System.out.println(valueA + "\n");


        int valueB = 10;
        System.out.println("Incrementando (++variable)\nValor inicial da variável: " + valueB);
        System.out.println(++valueB);
        System.out.println(valueB + "\n");

        int valueC = 10;
        System.out.println("Decrementando (variable--)\nValor inicial da variável: " + valueC);
        System.out.println(valueC--);
        System.out.println(valueC + "\n");


        int valueD = 10;
        System.out.println("Decrementando (--variable)\nValor inicial da variável: " + valueD);
        System.out.println(--valueD);
        System.out.println(valueD + "\n");


    }
}
