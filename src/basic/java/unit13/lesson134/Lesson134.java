package basic.java.unit13.lesson134;

import basic.java.util.Util;

import java.util.List;
import java.util.Optional;

public class Lesson134 {
    public static void main(String[] args) {
        Util.printTitle("Optional pt 01");

        Optional<String> o1 = Optional.of("ANDERSON");
        System.out.println(o1);
        Optional<String> o2 = Optional.ofNullable(null);
        System.out.println(o2);
        Optional<String> o3 = Optional.empty();
        System.out.println(o3);
        System.out.println("---------------------");

        Optional<String> nameOptional = Optional.ofNullable(findName("William"));
        Optional<String> emptyOptional = Optional.ofNullable(findName("error"));
        System.out.println(nameOptional);
        System.out.println(emptyOptional);

        String name = nameOptional.orElse("EMPTY");
        System.out.println("Name Optional : " + name);

        String empty = emptyOptional.orElse("EMPTY");
        System.out.println("Empty Optional : " + empty);

        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));


    }

    public static String findName(String name) {
        List<String> list = List.of("William", "DevDojo");
        int i = list.indexOf(name);
        if (i >= 0) {
            return list.get(i);
        }
        return null;
    }

    public static Optional<String> findNameOption(String name) {
        List<String> list = List.of("William", "DevDojo");
        int i = list.indexOf(name);
        if (i >= 0) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
