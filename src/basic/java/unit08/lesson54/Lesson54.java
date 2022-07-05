package basic.java.unit08.lesson54;

import basic.java.util.Util;

import java.util.Date;

public class Lesson54 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - Date");

        Date date = new Date(1_000_000_000_000L); // Date trabalha com long de milisegundos
        System.out.println(date);

        // Data agora
        Date dateNow = new Date();
        System.out.println(dateNow);
        System.out.println(dateNow.getTime());

        //
        System.out.println(dateNow.getTime() + 3_600_000);


    }
}
