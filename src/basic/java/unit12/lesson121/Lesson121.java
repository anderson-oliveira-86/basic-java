package basic.java.unit12.lesson121;

import basic.java.unit12.lesson119.Boat;
import basic.java.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Lesson121 {
    public static void main(String[] args) {
        Util.printTitle("Generics pt 06 - Métodos Genéricos");

        List<Boat> canoa = criarArrayComObjeto(new Boat("Canoa"));
        System.out.println(canoa);
    }
    private static <T> List<T> criarArrayComObjeto(T t){
        List<T> list = new ArrayList<>();
        list.add(t);
        return list;
    }

    private static <T extends Comparable<T>> List<T> criarArrayComObjeto2(T t){
        List<T> list = new ArrayList<>();
        list.add(t);
        return list;
    }
}

