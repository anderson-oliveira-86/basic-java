package basic.java.unit08.lesson51;

import basic.java.util.Util;

import java.util.Locale;

public class Lesson51 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - Strings pt 02");

        String nome = "Luffy";
        String numeros = "0123456";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f" ,"l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0,2));
        System.out.println(numeros.substring(3,numeros.length()));
        String nomeComEspacos = "  Name   ";
        System.out.println(nomeComEspacos.trim());

    }
}
