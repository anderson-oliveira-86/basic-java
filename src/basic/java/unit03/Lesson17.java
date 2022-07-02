package basic.java.unit03;

import basic.java.util.Util;

public class Lesson17 {
    public static void main(String[] args) {
        Util.printTitle("Array Multidimensional - Foreach");

        int[][] arrayMultidimensional = new int[4][4];

        //Array 1
        arrayMultidimensional[0][0] = 0;
        arrayMultidimensional[0][1] = 1;
        arrayMultidimensional[0][2] = 2;
        arrayMultidimensional[0][3] = 3;

        //Array 2
        arrayMultidimensional[1][0] = 4;
        arrayMultidimensional[1][1] = 5;
        arrayMultidimensional[1][2] = 6;
        arrayMultidimensional[1][3] = 7;

        //Array 3
        arrayMultidimensional[2][0] = 8;
        arrayMultidimensional[2][1] = 9;
        arrayMultidimensional[2][2] = 10;
        arrayMultidimensional[2][3] = 11;

        //Array 4
        arrayMultidimensional[3][0] = 12;
        arrayMultidimensional[3][1] = 13;
        arrayMultidimensional[3][2] = 14;
        arrayMultidimensional[3][3] = 15;

        for (int[] array :
                arrayMultidimensional) {
            System.out.print("|");
            for (int value :
                    array) {
                System.out.printf(" %2d |" , value);
            }
            System.out.print("\n\n");
        }

    }
}
