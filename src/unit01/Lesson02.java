package unit01;

import util.Util;

import java.sql.SQLOutput;

public class Lesson02 {
    public static void main(String[] args) {
        Util.printTitle("Operadores Aritméticos");

        System.out.println("Atenção - para calculos precisos como por exemplo\n" +
                "calculos financeiros é recomendado pela Oracle\n" +
                "utilizar a classe BigDecimal\n");

        //Soma
        int valueA = 20;
        int valueB = 10;
        double valueC = 5.0;
        double valueD = 2.0;


        //Soma (int + int)
        int resultSumInt = valueA + valueB;
        System.out.println("#### Soma (int + int) ####\n"+
                valueA + " + " + valueB + " = " + resultSumInt + "\n");

        //Soma (int + double)
        double resultSumDouble = valueA + valueC;
        System.out.println("#### Soma (int + double) ####\n"+
                valueA + " + " + valueC + " = " + resultSumDouble + "\n");

        //Subtração (int - int)
        int resultSubtractionInt = valueA - valueB;
        System.out.println("#### Subtração (int - int) ####\n"+
                valueA + " - " + valueB + " = " + resultSubtractionInt + "\n");

        //Subtração (int - double)
        double resultSubtractionDouble = valueA - valueC;
        System.out.println("#### Subtração (int - double) ####\n"+
                valueA + " - " + valueC + " = " + resultSubtractionDouble + "\n");

        //Multiplicação (int * int)
        int resultMultiplicationInt = valueA * valueB;
        System.out.println("#### Multiplicação (int * int) ####\n"+
                valueA + " * " + valueB + " = " + resultMultiplicationInt + "\n");

        //Multiplicação (int * double)
        double resultMultiplicationDouble = valueA * valueC;
        System.out.println("#### Multiplicação (int * double) ####\n"+
                valueA + " * " + valueC + " = " + resultMultiplicationDouble + "\n");

        //Divisão (int / int)
        int resultDivisionInt  = valueA / valueB;
        System.out.println("#### Divisão (int * int) ####\n"+
                valueA + " / " + valueB + " = " + resultDivisionInt + "\n");

        //Divisão (int / double)
        double resultDivisionDouble  = valueA / valueC;
        System.out.println("#### Divisão (int * double) ####\n"+
                valueA + " / " + valueC + " = " + resultDivisionDouble + "\n");

        //Divisão decimal (double / double )
        double result  = valueC / valueD;
        System.out.println("#### Divsão decimal (double / double) ####\n"+
                valueC + " / " + valueD + " = " + result + "\n");

        //Resto - (falta criar exemplo prático )
        double value = 5 % 2;

    }

}
