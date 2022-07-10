package basic.java.unit11.lesson102;

import basic.java.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Lesson102 {
    public static void main(String[] args) {
        Util.printTitle("Coleções pt 06 - List pt 01 e 02");

        List<String> nomes = new ArrayList<>(16);
        nomes.add("Anderson");
        nomes.add("JavaFoda");
        nomes.add("Bryan");
        nomes.add("Beatriz");
        nomes.add("Maria");
        nomes.add("João");
        System.out.println("foreach:");
        for (String nome :
                nomes) {
            System.out.println(nome);
        }
        System.out.println("\n###########\n");
        nomes.remove(4); //Removendo pelo indice
        nomes.remove("Maria"); //Removendo objetos iguais
        nomes.add("Goku");
        boolean isAdd = nomes.add("Testando true ou false");
        System.out.println("isAdd : " + isAdd);
        boolean isRemoveTrue = nomes.remove("Testando true ou false");
        boolean isRemoveFalse = nomes.remove("error");
        System.out.println("isRemoveTrue " + isRemoveTrue);
        System.out.println("isRemoveFalse " + isRemoveFalse);

        System.out.println("\nfor i");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

    }
}
