package basic.java.unit08.lesson53;

import basic.java.util.Util;

public class Lesson53 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - Strings pt 04 - StringBuilder");

        StringBuilder sb = new StringBuilder("Texto ");
        System.out.println(sb);
        sb.append("Texto2 ").append("Texto3");
        System.out.println(sb);

        StringBuilder stringReverse = new StringBuilder("ABCD EFGH IJKL");
        stringReverse.reverse();
        System.out.println(stringReverse);
        stringReverse.delete(0,3);
        System.out.println(stringReverse);
    }
}
