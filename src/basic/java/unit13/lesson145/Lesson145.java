package basic.java.unit13.lesson145;

import basic.java.util.Util;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class Lesson145 {
    public static void main(String[] args) {
        Util.printTitle("Streams pt 10 - Gerando streams pt 02");

        Stream.iterate(1,n -> n+2)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("\n-------------------------------------------------\n");

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1],n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);

        System.out.println("\n-------------------------------------------------\n");

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(()->random.nextInt(1,500))
                .limit(90)
                .forEach(System.out::println);
    }
}
