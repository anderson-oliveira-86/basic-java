package basic.java.unit08.lesson58;

import basic.java.util.Util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Lesson58 {
    public static void main(String[] args) {

        Util.printTitle("Classes Utilitárias - Internacionalização Números com Locale");

        System.out.println(Locale.getDefault());

        Locale localeBR = new Locale("pt" , "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeBR);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double valor = 10_000.2130;

        for (NumberFormat numberFormat :
                nfa) {
            System.out.println("Digitos decimais : " + numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        for (NumberFormat numberFormat :
                nfa) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
            System.out.println("Digitos decimais : " + numberFormat.getMaximumFractionDigits());
        }

        String valorString = "10000.2130";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
