package basic.java.unit11.lesson107;

import basic.java.util.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson107 {
    public static void main(String[] args) {
        Util.printTitle("Coleções pt 12 - Binary Search");

        List<Integer> listInteger = new ArrayList<>();

        listInteger.add(2);
        listInteger.add(0);
        listInteger.add(4);
        listInteger.add(3);
        // (-(ponto de inserção) -1)
        // index { 0, 1, 2, 3 }
        // value { 0, 2, 3, 4 }
        Collections.sort(listInteger);

        System.out.println(
                Collections.binarySearch(listInteger , 1)
        );

    }
}
