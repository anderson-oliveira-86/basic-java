package basic.java.unit13.lesson141;

import basic.java.unit13.lesson136.LightNovel;
import basic.java.util.Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lesson141 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara" , 8.99),
            new LightNovel("Overlord" , 3.99),
            new LightNovel("Violet Evergarden" , 5.99),
            new LightNovel("No Game no life" , 2.99),
            new LightNovel("Fullmetal Alchemist" , 5.99),
            new LightNovel("Kumo desuga" , 1.99),
            new LightNovel("Kumo desuga" , 1.99),
            new LightNovel("Monogatari" , 4.00)
    ));
    public static void main(String[] args) {
        Util.printTitle("Streams pt 06 - Finding and Matching");

        boolean verdadeiro = lightNovels.stream().anyMatch(ln -> ln.getPrice() > 8);
        boolean falso = lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9);
        System.out.println(verdadeiro);
        System.out.println(falso);

        boolean isGreaterThanZero = lightNovels.stream().allMatch(ln -> ln.getPrice() > 0);
        boolean noneIsGreaterThanZero = lightNovels.stream().noneMatch(ln -> ln.getPrice() > 0);
        System.out.println(isGreaterThanZero);
        System.out.println(noneIsGreaterThanZero);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

    }
}
