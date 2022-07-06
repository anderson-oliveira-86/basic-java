package basic.java.unit08.lesson68;

import basic.java.util.Util;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class Lesson68 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - TemporalAdjusters.");

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        now = now.withDayOfMonth(25);
        now = now.withMonth(10);
        now = now.withYear(1986);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        LocalDate agora = LocalDate.now();
        agora = agora.with(ChronoField.DAY_OF_MONTH , 20);
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        System.out.println();

        LocalDate nowDay = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println(nowDay);
        System.out.println(nowDay.getDayOfWeek());

        System.out.println();

        nowDay = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println(nowDay);
        System.out.println(nowDay.getDayOfWeek());

        System.out.println();

        nowDay = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(nowDay);
        System.out.println(nowDay.getDayOfWeek());

    }
}
