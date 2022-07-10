package basic.java.unit11.lesson109;

import basic.java.unit11.lesson104.HQ;
import basic.java.util.Util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lesson109 {
    public static void main(String[] args) {
        Util.printTitle("Coleções pt 14 - Iterator");

        List<HQ> hqs = new ArrayList<>(16);
        hqs.add(new HQ(5L,"Batman – O cavaleiro das trevas",100.7 , 2));
        hqs.add(new HQ(9L,"Reino do amanhã",134.7,3));
        hqs.add(new HQ(1L,"Watchmen" , 19.9,4));
        hqs.add(new HQ(7L,"Crise nas infinitas terras",17.9,0));
        hqs.add(new HQ(4L,"Batman – Ano um",1.8,0));
        hqs.add(new HQ(2L,"A saga da Fênix Negra",20.9,5));
        hqs.add(new HQ(6L,"All star Superman",15.7,10));
        hqs.add(new HQ(8L,"Sandman – Estação das brumas",41.6,20));
        hqs.add(new HQ(10L,"Maus – A história de um sobrevivente",1000.5,1));
        hqs.add(new HQ(3L,"Born again (Demolidor)",25.5,1));

        Iterator<HQ> hqIterator = hqs.iterator();
        while (hqIterator.hasNext()){
            if(hqIterator.next().getQuantidade() == 0){
                hqIterator.remove();
            }
        }
        for (HQ hq :
                hqs) {
            System.out.println(hq);
        }
        System.out.println("\n######################\n");
        // Predicate
        hqs.removeIf( hq -> hq.getQuantidade() == 1);

        for (HQ hq :
                hqs) {
            System.out.println(hq);
        }
    }
}
