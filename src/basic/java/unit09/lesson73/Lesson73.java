package basic.java.unit09.lesson73;

import basic.java.util.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson73 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - Regex pt 01 - Pattern e Matcher");

        String regex = "ab";
        String texto = "abaaba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto  : " + texto);
        System.out.println("indice : 0123456789");
        System.out.println("regex  : " + regex);
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}
