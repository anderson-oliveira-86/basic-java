package basic.java.unit13.lesson142;

import basic.java.util.Util;

import java.util.List;

public class Lesson142 {
    public static void main(String[] args) {
        Util.printTitle("Streams pt 07 - Reduce pt 01");

        List<Integer> integers = List.of(1,2,3,4,5,6);

        System.out.print("Imprimindo a soma da lista de inteiros : ");
        integers.stream()
                .reduce((x,y) -> x + y)
                .ifPresent(System.out::println);

        System.out.println("Imprimindo a soma de um número inicial 5 e a lista de inteiros : " + integers.stream()
                .reduce(5, (x, y) -> x + y));

        System.out.println("Method Reference : " + integers.stream()
                .reduce(5, Integer::sum));

        System.out.print("Multiplicando : ");
        integers.stream().reduce((x,y) -> x * y).ifPresent(System.out::println);

        System.out.print("Retornando o valor maior : ");
        integers.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println);

        System.out.print("Retornando o valor maior : ");
        integers.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println("Retornando o valor maior com Method Reference : " + integers.stream().reduce(Integer::max));


    }
}
