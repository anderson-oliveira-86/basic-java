package basic.java.unit13.lesson149;

import basic.java.unit13.lesson147.Category;
import basic.java.unit13.lesson147.LightNovel;
import basic.java.util.Util;

import java.util.*;
import java.util.stream.Collectors;

public class Lesson149 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99 , Category.FANTASY),
            new LightNovel("Overlord", 10.99 , Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99 , Category.DRAMA),
            new LightNovel("No Game no life", 2.99 , Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99 , Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99 , Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99 , Category.FANTASY),
            new LightNovel("Monogatari", 4.00 , Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Util.printTitle("Streams pt 14 - Collectors pt 04 - Grouping by pt 03");

        Map<Category, Long> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)),
                                Optional::get)));
        System.out.println(collect2);

    }
}
