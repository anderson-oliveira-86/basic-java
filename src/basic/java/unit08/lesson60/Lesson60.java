package basic.java.unit08.lesson60;

import basic.java.util.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Lesson60 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - SimpleDateFormat");

        String mascara = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(mascara);
        System.out.println(sdf.format(new Date()));

        String mascara2 = "'Brazil' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf2 = new SimpleDateFormat(mascara2);
        System.out.println(sdf2.format(new Date()));
    }
}
