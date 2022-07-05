package basic.java.unit08.lesson55;

import basic.java.util.Util;

import java.util.Calendar;
import java.util.Date;

public class Lesson55 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - Calendar");

        Calendar c = Calendar.getInstance();
        System.out.println(c);

        int firstDayOfWeek = c.getFirstDayOfWeek();

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        Date date = c.getTime();
        System.out.println(date);

        //Adicionando 2 dias
        c.add(Calendar.DAY_OF_MONTH , 2);
        //adicionando 2 horas
        c.add(Calendar.HOUR , 2);
        date = c.getTime();
        System.out.println(date);

        //adicionando 12 horas e virando o dia
        c.add(Calendar.HOUR , 12);
        date = c.getTime();
        System.out.println(date);

        //adicionando 18 horas sem alterar o dia
        c.roll(Calendar.HOUR , 18);
        date = c.getTime();
        System.out.println(date);
    }
}
