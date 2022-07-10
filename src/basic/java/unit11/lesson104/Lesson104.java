package basic.java.unit11.lesson104;

import basic.java.util.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson104 {
    public static void main(String[] args) {
        Util.printTitle("Coleções pt 09 - Sorting lists pt 01");

        //Obs Importante.: foi criada a classe HQ com hashCode e Equals pelo intellij IDE utilizando os 3 atributos (id,nome,valor)

        List<String> hqs = new ArrayList<>(6);
        hqs.add("Watchmen");
        hqs.add("A saga da Fênix Negra");
        hqs.add("Born again (Demolidor)");
        hqs.add("Batman – Ano um");
        hqs.add("Batman – O cavaleiro das trevas");
        hqs.add("All star Superman");
        hqs.add("Crise nas infinitas terras");
        hqs.add("Sandman – Estação das brumas");
        hqs.add("Reino do amanhã");
        hqs.add("Maus – A história de um sobrevivente");

        for (String hq :
                hqs) {
            System.out.println(hq);
        }

        System.out.println("\nSorting com Collections.sort()\n");
        Collections.sort(hqs);

        for (String hq :
                hqs) {
            System.out.println(hq);
        }

    }
}
