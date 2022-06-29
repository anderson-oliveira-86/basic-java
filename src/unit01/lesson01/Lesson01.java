package unit01.lesson01;

import util.Util;

public class Lesson01 {
    public static void main(String[] args) {
        //tipos primitivos
        //int, double, float, char, byte, short, long, boolean

        Util.printTitle("Tipos Primitivos");

        //Size 4 bytes - Range of values ( -2,147,483,648 to 2,147,483,647 ) - default value 0
        int minimumInteger = -2147483648;
        int maximumInteger = 2147483647;
        System.out.println("* tipo primitivo ( int )\n" +
                "Mínimo valor do int = " + minimumInteger + "\n" +
                "Máximo valor do int = " + maximumInteger + "\n");

        //Size 8 bytes - Range of values ( -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807  ) - default value 0
        long minimumLong = -9223372036854775808L;
        long maximumLong = 9223372036854775807L;
        System.out.println("* tipo primitivo ( long )\n" +
                "Mínimo valor do long = " + minimumLong + "\n" +
                "Máximo valor do long = " + maximumLong + "\n");

        //Size 8 bytes - Range of values ( 1.7E-308D to 1.7976931348623157E308D ) - default value 0.0d
        double minimumDouble = 1.7E-308d;
        double maximumDouble = 1.7976931348623157E308d;
        System.out.println("* tipo primitivo ( double )\n" +
                "Mínimo valor do double = " + minimumDouble + "\n" +
                "Máximo valor do double = " + maximumDouble + "\n");

        //Size 4 bytes - Range of values ( 3.4e-038F to 3.4e+038F ) - default value 0.0f
        float minimumFloat = 3.4e-038F;
        float maximumFloat = 3.4e+038F;
        System.out.println("* tipo primitivo ( float )\n" +
                "Mínimo valor do float = " + minimumFloat + "\n" +
                "Máximo valor do float = " + maximumFloat + "\n");

        //Size 1 byte - Range of values ( -128 to 127 ) - default value 0
        byte minimumByte = -128;
        byte maximumByte = 127;
        System.out.println("* tipo primitivo ( byte )\n" +
                "Mínimo valor do byte = " + minimumByte + "\n" +
                "Máximo valor do byte = " + maximumByte + "\n");

        //Size 2 bytes - Range of values ( -32768 to 32767 ) - default value 0
        short minimumShort = -32768;
        short maximumShort = 32767;
        System.out.println("* tipo primitivo ( short )\n" +
                "Mínimo valor do short = " + minimumShort + "\n" +
                "Máximo valor do short = " + maximumShort + "\n");

        //Size 1 byte - Rang of values (true or false) - default false
        boolean trueBoolean = true;
        boolean falseBoolean = false;
        System.out.println("* tipo primitivo ( boolean )\n" +
                "Valor true do boolean = " + trueBoolean + "\n" +
                "Valor false do boolean = " + falseBoolean + "\n");

        //Size 2 bytes - default value \u0000
        char minimumCharacter = 'A';
        char maximumCharacter = 'z';
        System.out.println("* tipo primitivo ( char )\n" +
                "exemplo de char = " + minimumCharacter + "\n" +
                "exemplo de char = " + maximumCharacter + "\n");

    }
}
