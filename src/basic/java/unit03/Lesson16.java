package basic.java.unit03;

import basic.java.util.Util;

public class Lesson16 {
    public static void main(String[] args) {
        Util.printTitle("Array - Foreach");

        int[] numeros = {2,5,8,13};

        for (int num :
                numeros) {
            System.out.println(num);
        }
    }
}
