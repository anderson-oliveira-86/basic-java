package basic.java.unit13.lesson132;

import basic.java.util.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Lesson132 {
    public static void main(String[] args) {
        Util.printTitle("Method Reference pt 01 - Referência a métodos estáticos");

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 500), new Anime("One Piece", 43) , new Anime("Naruto" , 150)));
//        Collections.sort(animeList , (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        Collections.sort(animeList , (a1,a2) -> AnimeComparators.compareByTitle(a1,a2));
        Collections.sort(animeList , AnimeComparators::compareByTitle);
        System.out.println(animeList);
        Collections.sort(animeList, AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
