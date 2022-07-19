package basic.java.unit13.lesson150;

import basic.java.unit13.lesson147.Category;
import basic.java.unit13.lesson147.LightNovel;
import basic.java.unit13.lesson147.Promotion;
import basic.java.util.Util;

import java.util.*;
import java.util.stream.Collectors;

public class Lesson150 {

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
        Util.printTitle("Streams pt 15 - Collectors pt 05 - Grouping by pt 04");

        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        // Map<Category, List<Promotion>>
        Map<Category, LinkedHashSet<Promotion>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.mapping(lightNovel -> lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE, Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect1);

    }
}
