package basic.java.unit09.lesson78;

import basic.java.util.Util;

public class Lesson78 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - Scanner - Tokens e Delimitadores");

        String texto = "Levi, Eren, Mikasa";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());


        }
    }
}
