package basic.java.unit08.lesson59;

import basic.java.util.Util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Lesson59 {
    public static void main(String[] args) {

        Util.printTitle("Classes Utilitárias - Internacionalização de moeda com Locale");
        System.out.println(Locale.getDefault());

        Locale localeBR = new Locale("pt" , "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 10_000.2130;

        for (NumberFormat numberFormat :
                nfa) {
            System.out.println("Digitos decimais : " + numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "$10,000.21";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
