package basic.java.unit09.lesson74;

import basic.java.util.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson74 {

    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - Regex pt 02 - Pattern e Matcher - Meta caracteres");

        // Meta Characteres
        test01();
        test02();
        test03();
        test04();
        test05();
        test06();
        test07();

    }
        private static void test01(){
        String regex = "aba";
        String texto = "abaaba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto  : " + texto);
        System.out.println("indice : 0123456789");
        System.out.println("regex  : " + regex);
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
            System.out.print("\n");
    }

    private static void test02(){
        // \d = Todos os digitos
        String regex = "\\d";

        String texto = "hhj212gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto  : " + texto);
        System.out.println("indice : 0123456789");
        System.out.println("regex  : " + regex);
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        System.out.print("\n");
    }

    private static void test03(){
        // \D = Tudo que não for digito
        String regex = "\\D";

        String texto = "hhj212gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto  : " + texto);
        System.out.println("indice : 0123456789");
        System.out.println("regex  : " + regex);
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        System.out.print("\n");
    }

    private static void test04(){
        // \s = Tudo que for espaço em branco ( \t, \n, \f, \r )
        String regex = "\\s";

        String texto = "hhj2 12gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto  : " + texto);
        System.out.println("indice : 0123456789");
        System.out.println("regex  : " + regex);
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        System.out.print("\n");
    }

    private static void test05(){
        // \S = Todos os caracteres excluindo os brancos
        String regex = "\\S";

        String texto = "hhj2 12gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto  : " + texto);
        System.out.println("indice : 0123456789");
        System.out.println("regex  : " + regex);
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        System.out.print("\n");
    }

    private static void test06(){
        // \W = Tudo que for de a-z A-Z, Dígitos, _
        String regex = "\\w";

        String texto = "hhj2#12@gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto  : " + texto);
        System.out.println("indice : 0123456789");
        System.out.println("regex  : " + regex);
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        System.out.print("\n");
    }

    private static void test07(){
        // \w = Tudo que não for de a-z A-Z, Dígitos, _
        String regex = "\\W";

        String texto = "hhj2#12@gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto  : " + texto);
        System.out.println("indice : 0123456789");
        System.out.println("regex  : " + regex);
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        System.out.print("\n");
    }
}
