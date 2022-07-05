package basic.java.unit08.lesson49;

import basic.java.util.Util;

public class Lesson49 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - Wrappers pt 02");

        //107 - Classes Utilitárias - Wrappers pt 02


        Integer integerWrapper = 10;
        //Autoboxing
        int autoboxing = integerWrapper;
        System.out.println(autoboxing);

        //Unboxing
        int intPrimitive = 10;
        Integer unboxing = intPrimitive;
        System.out.println(unboxing);
        //
        Integer integer2 = Integer.parseInt("2");
        System.out.println(integer2);
        boolean verdadeiro = Boolean.getBoolean("true");
        System.out.println(verdadeiro);

        Character charW = 'W';
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));

    }
}
