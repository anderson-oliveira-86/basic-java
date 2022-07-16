package basic.java.unit13.lesson137;

import basic.java.unit13.lesson136.LightNovel;
import basic.java.util.Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson137 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara" , 8.99),
            new LightNovel("Overlord" , 3.99),
            new LightNovel("Violet Evergarden" , 5.99),
            new LightNovel("No Game no life" , 2.99),
            new LightNovel("Fullmetal Alchemist" , 5.99),
            new LightNovel("Kumo desuga" , 1.99),
            new LightNovel("Monogatari" , 4.00)
    ));

    public static void main(String[] args) {
        Util.printTitle("Streams pt 02 - Introduction pt 02");

        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
