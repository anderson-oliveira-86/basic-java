package basic.java.unit13.lesson130;

import basic.java.util.Util;

import java.util.List;
import java.util.function.Consumer;

public class Lesson130 {
    public static void main(String[] args) {
        Util.printTitle("Lambdas pt 02 - Consumer");

        List<String> strings = List.of("Anderson", "William", "Suane", "Luffy", "Zoro");
        List<Integer> integers = List.of( 1,2,3,4,5);
        forEach(strings , s -> System.out.println(s));
        forEach(integers , in -> System.out.println(in));
    }

    private static <T> void forEach(List<T> list , Consumer<T> consumer){
        for (T e : list){
            consumer.accept(e);
        }
    }
}
