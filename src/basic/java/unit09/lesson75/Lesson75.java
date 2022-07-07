package basic.java.unit09.lesson75;

import basic.java.util.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson75 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - Regex pt 03 - Pattern e Matcher - Range");

        // [abc] range
        // [a-zA-C]
        test01();
        test02();
//        test03();


    }
    private static void test01(){
        String regex = "[abc]";
        String texto = "cafeBABE";
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
        String regex = "[a-zA-C]";
        String texto = "cafeBABE";
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

//    private static void test03(){
//        int numeroHex = 0x59F86A;
//        String regex = "0[xX][0-9a-fA-F]";
//        System.out.println(numeroHex);
//
//        String texto = "12 0x 0X 0xFFABC 0x109 0x1";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(texto);
//        System.out.println("texto  : " + texto);
//        System.out.println("indice : 0123456789");
//        System.out.println("regex  : " + regex);
//        System.out.println("posições encontradas");
//        while (matcher.find()){
//            System.out.print(matcher.start() + " " + matcher.group() + "\n");
//        }
//        System.out.print("\n");
//    }
}
