package basic.java.unit13.lesson133;

import basic.java.unit12.lesson119.Boat;
import basic.java.unit13.lesson132.Anime;
import basic.java.unit13.lesson132.AnimeComparators;
import basic.java.util.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Lesson133 {
    public static void main(String[] args) {
        Util.printTitle("Method Reference pt 02 - Referência a métodos não estáticos");

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 500), new Anime("One Piece", 43), new Anime("Naruto", 150)));
        AnimeComparators animeComparators = new AnimeComparators();
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        //
        List<String> list = new ArrayList<>(List.of("Anderson", "Rimuru", "Veldora", "Hikimaru"));
        list.sort(String::compareTo);
        System.out.println(list);
        Function<String,Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

        BiPredicate<List<String> , String> checkName = List::contains;
        System.out.println(checkName.test(list,"Rimuru"));

        //
        Supplier<AnimeComparators> newAnimeComparators = () -> new AnimeComparators();
        AnimeComparators animeComparators1 = newAnimeComparators.get();
        List<Anime> animeList2 = new ArrayList<>(List.of(new Anime("Berserk", 500), new Anime("One Piece", 43), new Anime("Naruto", 150)));
        animeList2.sort(animeComparators1::compareByEpisodesNonStatic);
        System.out.println(animeList2);

        BiFunction<String, Integer,Anime> animeBiFunction = (title,episodes) -> new Anime(title,episodes);
        BiFunction<String, Integer,Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Shanks" , 90));
    }
}
