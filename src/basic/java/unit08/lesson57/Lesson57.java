package basic.java.unit08.lesson57;

import basic.java.util.Util;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Lesson57 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - Internacionalização Datas com Locale");


        Calendar calendar = Calendar.getInstance();

        Locale localeItaly = new Locale("it" ,"IT");
        Locale localeSwitzerland = new Locale("it","CH");
        Locale localeBrazil = new Locale("pt","BR");
        Locale localeIndia = new Locale("hi","IN");
        Locale localeJapan = new Locale("ja","JP");
        Locale localeNetherlands = new Locale("nl","NL");

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL , localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL , localeSwitzerland);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL , localeBrazil);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeNetherlands);

        System.out.println("\nEN");
        System.out.printf("%-11s : %s%n" , localeItaly.getDisplayCountry() , df1.format(calendar.getTime()));
        System.out.printf("%-11s : %s%n" , localeSwitzerland.getDisplayCountry() , df2.format(calendar.getTime()));
        System.out.printf("%-11s : %s%n" , localeBrazil.getDisplayCountry() , df3.format(calendar.getTime()));
        System.out.printf("%-11s : %s%n" , localeIndia.getDisplayCountry() , df4.format(calendar.getTime()));
        System.out.printf("%-11s : %s%n" , localeJapan.getDisplayCountry() , df5.format(calendar.getTime()));
        System.out.printf("%-11s : %s%n" , localeNetherlands.getDisplayCountry() , df6.format(calendar.getTime()));

        System.out.println("\nBR");

        System.out.printf("%-11s : %s%n" , localeItaly.getDisplayCountry(localeBrazil) , df1.format(calendar.getTime()));
        System.out.printf("%-11s : %s%n" , localeSwitzerland.getDisplayCountry(localeBrazil) , df2.format(calendar.getTime()));
        System.out.printf("%-11s : %s%n" , localeBrazil.getDisplayCountry(localeBrazil) , df3.format(calendar.getTime()));
        System.out.printf("%-11s : %s%n" , localeIndia.getDisplayCountry(localeBrazil) , df4.format(calendar.getTime()));
        System.out.printf("%-11s : %s%n" , localeJapan.getDisplayCountry(localeBrazil) , df5.format(calendar.getTime()));
        System.out.printf("%-11s : %s%n" , localeNetherlands.getDisplayCountry(localeBrazil) , df6.format(calendar.getTime()));

    }
}
