package basic.java.unit08.lesson64;

import basic.java.util.Util;

import java.time.Instant;
import java.time.LocalDateTime;

public class Lesson64 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - Instant");

        //Trabalhando com nano segundos
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); //999.999.999

        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3 , 0));
        System.out.println(Instant.ofEpochSecond(3 , 1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3 , -1_000_000_000));
    }
}
