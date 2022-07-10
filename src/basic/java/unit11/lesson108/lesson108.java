package basic.java.unit11.lesson108;

import basic.java.util.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lesson108 {
    public static void main(String[] args) {
        Util.printTitle("Coleções pt 13 - Conversão de Lista para Arrays e vice versa");

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("############################");
        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        // Forma correta de utilizar o Arrays.asList()
        List<Integer> arrayToList = new ArrayList<>(Arrays.asList(numerosArray));
        arrayToList.set(0,12);
        System.out.println(Arrays.asList(numerosArray));
        System.out.println(arrayToList);

        // Java 11 usando List.of()
        List<String> stringList = List.of("Maria", "João", "Ricardo");
    }

}
