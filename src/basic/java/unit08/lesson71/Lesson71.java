package basic.java.unit08.lesson71;

import basic.java.util.Util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Lesson71 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - DateTimeFormatter");

        LocalDate localDate = LocalDate.now();
        String s1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = localDate.format(DateTimeFormatter.ISO_DATE);
        String s3 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();
        LocalDate parse1 = LocalDate.parse("20220706" , DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2022-07-06+05:00" , DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2022-07-06" , DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2022-07-06T21:44:47.2826357" , DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String s5 = LocalDate.now().format(formatterBR);
        System.out.println(s5);
        LocalDate parseBR = LocalDate.parse("06/07/2022", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String s6 = LocalDate.now().format(formatterGR);
        System.out.println(s6);

        LocalDate parseGR = LocalDate.parse("06.Juli.2022", formatterGR);
        System.out.println(parseGR);
    }
}
