package unit03;

import util.Util;

public class Lesson14 {
    public static void main(String[] args) {
        Util.printTitle("Array - Primeiro passo");

        int[] age = new int[3];

        age[0] = 21;
        age[1] = 35;
        age[2] = 48;

        System.out.println("Primeira posição do Array " + age[0]);
        System.out.println("Segunda posição do Array " + age[1]);
        System.out.println("Terceira posição do Array " + age[2]);

    }
}
