package unit03;

import util.Util;

public class Lesson18 {
    public static void main(String[] args) {
        Util.printTitle("Array Multidimensional - Inicialização");

        int[][] arrayMultidimensional = new int[3][];

        arrayMultidimensional[0] = new int[2];
        arrayMultidimensional[1] = new int[5];
        arrayMultidimensional[2] = new int[]{8,9,0};

        arrayMultidimensional[0][0] = 1;
        arrayMultidimensional[0][1] = 2;

        arrayMultidimensional[1][0] = 3;
        arrayMultidimensional[1][1] = 4;
        arrayMultidimensional[1][2] = 5;
        arrayMultidimensional[1][3] = 6;
        arrayMultidimensional[1][4] = 7;

//        arrayMultidimensional[2][0] = 8;
//        arrayMultidimensional[2][1] = 9;
//        arrayMultidimensional[2][2] = 0;

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
