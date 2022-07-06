package basic.java.unit08.lesson61;

import basic.java.util.Util;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class Lesson61 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - LocalDate");

        LocalDate date = LocalDate.of(2023 , Month.JANUARY, 27);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(LocalDate.now());
        System.out.println(date);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

        LocalDate agora = LocalDate.now();
        agora = agora.plusWeeks(1);
        System.out.println(agora);

    }
}
