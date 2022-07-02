package basic.java.unit02;

import basic.java.util.Util;

public class Lesson10 {
    public static void main(String[] args) {
        Util.printTitle("Estruturas Condicionais - Switch");

        //Exemplo 1 : Imprimindo o dia da semana
        //Exemplo 2 : Imprimindo o trimestre do ano

        int dia = 5;
        String name;

        //Tipos aceitos: char, int, byte, short, enum, String
        switch (dia){
            default:
                name = "inválid";
                break;
            case 1:
                name = "Domingo";
                break;
            case 2:
                name = "Segunda";
                break;
            case 3:
                name = "Terça";
                break;
            case 4:
                name = "Quarta";
                break;
            case 5:
                name = "Quinta";
                break;
            case 6:
                name = "Sexta";
                break;
            case 7:
                name = "Sabado";
                break;
        }
        System.out.println("Dia da Semana : " + name);

        int mes = 8;
        String trimestre;
        switch (mes){
            default:
                trimestre = "inválid";
                break;
            case 1:
            case 2:
            case 3:
                trimestre = "primeiro trimestre";
                break;
            case 4:
            case 5:
            case 6:
                trimestre = "segundo trimestre";
                break;
            case 7:
            case 8:
            case 9:
                trimestre = "terceiro trimestre";
                break;
            case 10:
            case 11:
            case 12:
                trimestre = "quarto trimestre";
                break;

        }
        System.out.println("Trimestre do ano : " + trimestre);

    }
}
