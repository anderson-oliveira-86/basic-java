package basic.java.unit13.lesson136;

import basic.java.util.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lesson136 {

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

        Util.printTitle("Streams pt 01 - Introduction pt 01");

        //1. order LightNovel by title
        //2. retrieve the first 3 light novels with prive less than 4

        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));

        List<String> titles = new ArrayList<>();
        for (LightNovel ln :
                lightNovels) {
            if(ln.getPrice() <= 4){
                titles.add(ln.getTitle());
            }
            if(titles.size() >= 3){
                break;
            }
        }
        System.out.println(lightNovels);
        System.out.println(titles);


    }
}
