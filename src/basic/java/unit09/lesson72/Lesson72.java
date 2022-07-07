package basic.java.unit09.lesson72;

import basic.java.util.Util;

import java.util.Locale;
import java.util.ResourceBundle;

public class Lesson72 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - ResourceBundle");

        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        String hello = bundle.getString("hello");
        String goodMorning = bundle.getString("good.morning");
        System.out.println(hello);
        System.out.println(goodMorning);

        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        hello = bundle.getString("hello");
        goodMorning = bundle.getString("good.morning");
        System.out.println(hello);
        System.out.println(goodMorning);
    }
}
