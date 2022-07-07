package basic.java.unit09.lesson76;

import basic.java.util.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson76 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - Regex pt 04 - Pattern e Matcher - Quantificadores pt 01");

        test01();
        test02();
    }

    // []
    // ? zero ou uma
    // * zero ou mais
    // + uma ou mais
    // {n,m} de n até m
    // ()
    // | o(v|c)o neste caso ele pega a palavra ovo e oco
    // $
    // 1.3 = 123, 133, 1@3, 1A3
    private static void test01(){
        int numeroHex = 0x59F86A;
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        System.out.println(numeroHex);

        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
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
        int numeroHex = 0x59F86A;
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        System.out.println(numeroHex);

        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
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
