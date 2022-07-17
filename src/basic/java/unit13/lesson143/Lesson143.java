package basic.java.unit13.lesson143;

import basic.java.unit13.lesson136.LightNovel;
import basic.java.util.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Lesson143 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara" , 8.99),
            new LightNovel("Overlord" , 10.99),
            new LightNovel("Violet Evergarden" , 5.99),
            new LightNovel("No Game no life" , 2.99),
            new LightNovel("Fullmetal Alchemist" , 5.99),
            new LightNovel("Kumo desuga" , 1.99),
            new LightNovel("Kumo desuga" , 1.99),
            new LightNovel("Monogatari" , 4.00)
    ));

    public static void main(String[] args) {
        Util.printTitle("Streams pt 08 - Reduce pt 02");

        // por padrão o stream realiza o unboxing de tipos primitivos para Classes Wrappers
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        // utilizando mapToDouble, mapToInt, mapToLong vc evita que seja realizado o unboxing
        // necessário avaliar a necessidade de realizar esse tipo de tarefa, por exemplo em casos de aplicações de alta performance.
        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();



    }
}
