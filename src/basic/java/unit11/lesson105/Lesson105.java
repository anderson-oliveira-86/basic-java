package basic.java.unit11.lesson105;

import basic.java.unit11.lesson104.HQ;
import basic.java.util.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson105 {
    public static void main(String[] args) {
        Util.printTitle("Coleções pt 10 - Sorting lists pt 02 - Comparable");

        List<HQ> hqs = new ArrayList<>(16);
        hqs.add(new HQ(5L,"Batman – O cavaleiro das trevas",100.7));
        hqs.add(new HQ(9L,"Reino do amanhã",134.7));
        hqs.add(new HQ(1L,"Watchmen" , 19.9));
        hqs.add(new HQ(7L,"Crise nas infinitas terras",17.9));
        hqs.add(new HQ(4L,"Batman – Ano um",1.8));
        hqs.add(new HQ(2L,"A saga da Fênix Negra",20.9));
        hqs.add(new HQ(6L,"All star Superman",15.7));
        hqs.add(new HQ(8L,"Sandman – Estação das brumas",41.6));
        hqs.add(new HQ(10L,"Maus – A história de um sobrevivente",1000.5));
        hqs.add(new HQ(3L,"Born again (Demolidor)",25.5));

        for (HQ hq :
                hqs) {
            System.out.println(hq);
        }
        System.out.println("\nSorting com Collections.sort(hqs) utilizando a implementação Comparable\n");
        Collections.sort(hqs);
        for (HQ hq :
                hqs) {
            System.out.println(hq);
        }

    }
}
