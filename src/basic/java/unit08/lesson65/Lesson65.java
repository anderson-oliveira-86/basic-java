package basic.java.unit08.lesson65;

import basic.java.util.Util;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Lesson65 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - Duration");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        System.out.println(nowAfterTwoYears);
        LocalTime timeMinusSevenHours = LocalTime.now().minusHours(-7);
        System.out.println(timeMinusSevenHours);

        LocalTime timeNow = LocalTime.now();

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow, timeMinusSevenHours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

    }
}
