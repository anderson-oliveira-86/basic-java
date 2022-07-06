package basic.java.unit08.lesson65;

import basic.java.util.Util;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

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
        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofMinutes(3);
        Duration d6 = Duration.of(3, ChronoUnit.HOURS);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);

    }
}
