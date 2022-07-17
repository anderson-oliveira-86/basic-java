package basic.java.unit13.lesson144;

import basic.java.util.Util;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson144 {
    public static void main(String[] args) {
        Util.printTitle("Streams pt 09 - Gerando streams pt 01");

        IntStream.rangeClosed(1,50)
                .filter(n -> n % 2 ==0)
                .forEach( n -> System.out.print(n + " "));

        System.out.print("\n------------------------------------\n");

        IntStream.range(1,50)
                .filter(n -> n % 2 ==0)
                .forEach( n -> System.out.print(n + " "));

        System.out.print("\n------------------------------------\n");

        Stream.of("Eleve ", " O", " Cosmo", " no seu coração")
                .map(String::toUpperCase)
                .forEach(s-> System.out.println(s + " "));

        System.out.print("\n------------------------------------\n");

        int[] num = {1,2,3,4,5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        System.out.print("\n------------------------------------\n");

        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))){
            lines.filter(l -> l.contains("Java"))
                    .forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
