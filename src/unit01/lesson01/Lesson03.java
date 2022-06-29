package unit01.lesson01;

import util.Util;

public class Lesson03 {
    public static void main(String[] args) {

        Util.printTitle("Operadores Relacionais");

        int valueA = 10;
        int valueB = 10;
        int valueC = 15;

        //Igual (true)
        boolean isEqualTrue = valueA == valueB;
        System.out.println("#### Operador Igual ( == ) ####\n" +
                "O valor " + valueA + " é igual ao valor " + valueB + "? Resposta: " + isEqualTrue + "\n");

        //Igual (false)
        boolean isEqualFalse = valueA == valueC;
        System.out.println("#### Operador Igual ( == ) ####\n" +
                "O valor " + valueA + " é igual ao valor " + valueC + "? Resposta: " + isEqualFalse + "\n");

        //Menor (true)
        boolean isMinorTrue = valueA < valueC;
        System.out.println("#### Operador Menor ( < ) ####\n" +
                "O valor " + valueA + " é menor que o valor " + valueC + "? Resposta: " + isMinorTrue + "\n");

        //Menor (false)
        boolean isMinorFalse = valueC < valueA;
        System.out.println("#### Operador Menor ( < ) ####\n" +
                "O valor " + valueC + " é menor que o valor " + valueA + "? Resposta: " + isMinorFalse + "\n");

        //Menor igual (true)
        boolean isMinorOrEqualTrue = valueA <= valueC;
        System.out.println("#### Operador Menor ou Igual ( <= ) ####\n" +
                "O valor " + valueA + " é menor ou igual ao valor " + valueC + "? Resposta: " + isMinorOrEqualTrue + "\n");

        //Menor igual (true)
        boolean isMinorOrEqualTrue2 = valueA <= valueB;
        System.out.println("#### Operador Menor ou Igual ( <= ) ####\n" +
                "O valor " + valueA + " é menor ou igual ao valor " + valueB + "? Resposta: " + isMinorOrEqualTrue2 + "\n");

        //Menor igual (false)
        boolean isMinorOrEqualFalse = valueC <= valueA;
        System.out.println("#### Operador Menor ou Igual ( <= ) ####\n" +
                "O valor " + valueC + " é menor ou igual ao valor " + valueA + "? Resposta: " + isMinorOrEqualFalse + "\n");

        //Maior (true)
        boolean isMajorTrue = valueC > valueA;
        System.out.println("#### Operador Maior ( > ) ####\n" +
                "O valor " + valueC + " é maior que o valor " + valueA + "? Resposta: " + isMajorTrue + "\n");

        //Maior (false)
        boolean isMajorFalse = valueC > valueA;
        System.out.println("#### Operador Maior ( > ) ####\n" +
                "O valor " + valueA + " é maior que o valor " + valueC + "? Resposta: " + isMajorFalse + "\n");

        //Maior igual (true)
        boolean isMajorOrEqualTrue = valueC >= valueA;
        System.out.println("#### Operador Maior ou Igual ( >= ) ####\n" +
                "O valor " + valueC + " é maior ou igual ao valor " + valueA + "? Resposta: " + isMajorOrEqualTrue + "\n");

        //Maior igual (true)
        boolean isMajorOrEqualTrue2 = valueB >= valueA;
        System.out.println("#### Operador Maior ou Igual ( >= ) ####\n" +
                "O valor " + valueB + " é maior ou igual ao valor " + valueA + "? Resposta: " + isMajorOrEqualTrue2 + "\n");

        //Maior igual (false)
        boolean isMajorOrEqualFalse = valueA >= valueC;
        System.out.println("#### Operador Maior ou Igual ( >= ) ####\n" +
                "O valor " + valueA + " é maior ou igual ao valor " + valueC + "? Resposta: " + isMajorOrEqualFalse + "\n");

        //Diferente (true)
        boolean isDifferentTrue = valueA != valueC;
        System.out.println("#### Operador Diferente ( != ) ####\n" +
                "O valor " + valueA + " é diferente do valor " + valueC + "? Resposta: " + isDifferentTrue + "\n");

        //Diferente (false)
        boolean isDifferentFalse = valueA != valueB;
        System.out.println("#### Operador Diferente ( != ) ####\n" +
                "O valor " + valueA + " é diferente do valor " + valueB + "? Resposta: " + isDifferentFalse + "\n");

    }
}
