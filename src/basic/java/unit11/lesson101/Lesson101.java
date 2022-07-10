package basic.java.unit11.lesson101;

import basic.java.util.Util;

public class Lesson101 {
    public static void main(String[] args) {
        Util.printTitle("Coleções pt 01 - equals pt 01");

        Smartphone s1 = new Smartphone("1ABC3" , "iPhone");
        Smartphone s2 = new Smartphone("1ABC3" , "iPhone");
        System.out.println(s1.equals(s2));

    }
}
