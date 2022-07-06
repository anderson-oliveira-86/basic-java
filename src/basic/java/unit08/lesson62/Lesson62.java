package basic.java.unit08.lesson62;

import basic.java.util.Util;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Lesson62 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - LocalTime");

        LocalTime time = LocalTime.of(23, 32, 12);
        System.out.println(time);
        LocalTime now = LocalTime.now();
        System.out.println(now);

        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.get(ChronoField.HOUR_OF_DAY));

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MAX);

    }
}
