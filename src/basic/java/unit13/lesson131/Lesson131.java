package basic.java.unit13.lesson131;

import basic.java.util.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Lesson131 {
    public static void main(String[] args) {
        Util.printTitle("Lambdas pt 03 - Function");

        List<String> strings = List.of("Natsu", "Allucard" , "Anderson");
        List<Integer> map = map(strings, s -> s.length());
        List<String> map1 = map(strings, s -> s.toUpperCase());
        System.out.println(map);
        System.out.println(map1);

    }
    private static <T,R> List<R> map(List<T> list , Function<T,R> function){
        List<R> result = new ArrayList<>();
        for(T e : list){
            R apply = function.apply(e);
            result.add(apply);
        }
        return result;
    }
}
