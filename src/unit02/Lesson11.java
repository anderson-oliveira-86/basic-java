package unit02;

import util.Util;

public class Lesson11 {
    public static void main(String[] args) {
        Util.printTitle("Estrutura de Repetição - while, do while e for");

        int valueA = 0;
        int valueB = 11;
        int valueC = 0;
        int valueD = 11;

        // While (true)
        //primeiro verifica se a condição e se for true executa o bloco de código
        System.out.println("While (true) : ValueA");
        while (valueA <= 10){
            System.out.println("valueA : " + valueA++);
        }

        // While (false)
        // primeiro verifica se a condição e se for false não executa o bloco de código
        System.out.println("\nWhile (false) : ValueB");
        while (valueB <= 10){
            System.out.println("valueB : " + valueB++ + "\n");
        }

        // Do While (true)
        // executa o bloco de código uma vez, depois verifica a condição
        // se a condição for true, executa novamente o bloco de código
        System.out.println("\nDo While (true) : ValueC");
        do {
            System.out.println("valueC : " + valueC++);
        }while (valueC <= 10);

        // Do While (false)
        // executa o bloco de código uma vez, depois verifica a condição
        // se a condição for false, não executa novamente o bloco de código
        System.out.println("\nDo While (false) : ValueD");
        do {
            System.out.println("valueD : " + valueD++);
        }while (valueD <= 10);

        //for
        System.out.println("\n#### For até 10 ####");
        for (int i = 0; i <= 10; i++) {
            System.out.println("For : " + i);
        }

    }
}
