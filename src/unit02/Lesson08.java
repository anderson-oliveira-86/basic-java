package unit02;

import util.Util;

public class Lesson08 {
    public static void main(String[] args) {
        Util.printTitle("Estruturas Condicionais - IF");

        // Verificando classificação indicativa de filmes
        // Filmes +18
        // Filmes +14
        // Filmes Livre

        // if (true)
        System.out.println("if (true)");
        int valueA = 19;
        if(valueA > 18){
            System.out.println("Classificação indicativa +18");
        }

        // if (false)
        System.out.println("\nif (false)");
        int valueB = 10;
        if(valueB > 18){
            System.out.println("Classificação indicativa +18");
        }

        // if and else (true)
        System.out.println("\nif and else (true)");
        int valueC = 19;
        if(valueC > 18){
            System.out.println("Classificação indicativa +18");
        }else{
            System.out.println("Classificação Livre");
        }

        // if and else (false)
        System.out.println("\nif and else (false)");
        int valueD = 10;
        if(valueD > 18){
            System.out.println("Classificação indicativa +18");
        }else{
            System.out.println("Classificação Livre");
        }

        // if, else if and else(true , false)
        System.out.println("\nif, else if and else (true , false)");
        int valueE = 19;
        if(valueE > 18){
            System.out.println("Classificação indicativa +18");
        }else if(valueE > 14){
            System.out.println("Classificação indicativa +14");
        }else{
            System.out.println("Classificação Livre");
        }

        // if, else if and else(false , true)
        System.out.println("\nif, else if and else (false , true)");
        int valueF = 15;
        if(valueF > 18){
            System.out.println("Classificação indicativa +18");
        }else if(valueE > 14){
            System.out.println("Classificação indicativa +14");
        }else{
            System.out.println("Classificação Livre");
        }

        // if, else if and else(false , false)
        System.out.println("\nif, else if and else (false , false)");
        int valueG = 12;
        if(valueG > 18){
            System.out.println("Classificação indicativa +18");
        }else if(valueG > 14){
            System.out.println("Classificação indicativa +14");
        }else{
            System.out.println("Classificação Livre");
        }
    }
}
