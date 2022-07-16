package basic.java.unit13.lesson138;

import basic.java.unit13.lesson136.LightNovel;
import basic.java.util.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lesson138 {

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
        Util.printTitle("Streams pt 03 - Introduction pt 03");

        lightNovels.stream().forEach(System.out::println);

        long count = lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                .count();
        System.out.println(count);

        long count1 = lightNovels.stream()
                .distinct()
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                .count();
        System.out.println(count1);



    }
}
