package basic.java.unit13.lesson139;

import basic.java.util.Util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Lesson139 {
    public static void main(String[] args) {
        Util.printTitle("Streams pt 04 - FlatMap pt 01");

        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicsDesigners = List.of("Wildnei Suane" , "Catarina Santos" , "Sandy Carolina");
        List<String> developers = List.of("William" , "David", "Harisson");
        List<String> students = List.of("Édipo" , "Gustavo Lima" , "Gustavo Mendes" , "Guilherme");

        devdojo.add(graphicsDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people :
                devdojo) {
            for (String person :
                    people) {
                System.out.println(person);
            }
        }

        System.out.println("------------------------------------------------");
        //utilizando o FlatMap
        devdojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
