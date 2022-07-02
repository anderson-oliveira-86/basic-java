package basic.java.unit03;

import basic.java.util.Util;

public class Lesson15 {
    public static void main(String[] args) {

        Util.printTitle("Array - atributo length");

        Integer[] age = new Integer[4];
        age[0] = 19;
        age[1] = 25;
        age[2] = 36;
        age[3] = 49;

        for (int i = 0; i < age.length; i++) {
            System.out.println("Posição do array : " + i + " contém o valor " + age[i]);
        }
    }
}
