package basic.java.unit13.lesson148;

import basic.java.unit13.lesson147.Category;
import basic.java.unit13.lesson147.LightNovel;
import basic.java.unit13.lesson147.Promotion;
import basic.java.util.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lesson148 {
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
        Util.printTitle("Streams pt 13 - Collectors pt 03 - Grouping by pt 02");

        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
        System.out.println(collect);

        // Map<Category, Map<Promotion , List<LightNovel>>>

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));

        System.out.println(collect1);


    }
}
