package basic.java.unit08.lesson67;

import basic.java.util.Util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class Lesson67 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - ChronoUnit");

        LocalDate nowLocalDateTime = LocalDate.now();
        Period p3 = Period.ofWeeks(58);
        System.out.println(nowLocalDateTime.until(nowLocalDateTime.plusDays(p3.getDays()) , ChronoUnit.DAYS));

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime aniversario = LocalDateTime.of(1988, Month.AUGUST , 06 , 12 , 0 ,0);

        System.out.println(ChronoUnit.DAYS.between(aniversario , now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario , now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario , now));
        System.out.println(ChronoUnit.YEARS.between(aniversario , now));

    }
}
