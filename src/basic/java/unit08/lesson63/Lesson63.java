package basic.java.unit08.lesson63;

import basic.java.util.Util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Lesson63 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - LocalDateTime");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate date = LocalDate.parse("2022-08-06");
        System.out.println(date);
        LocalTime time = LocalTime.parse("09:45:21");
        System.out.println(time);

        LocalDateTime ldt1 = date.atTime(time);
        System.out.println(ldt1);

        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt2);

    }
}
