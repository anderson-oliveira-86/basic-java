package basic.java.unit11.lesson114;

import basic.java.unit11.lesson104.HQ;
import basic.java.unit11.lesson113.Consumidor;
import basic.java.util.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson114 {
    public static void main(String[] args) {
        Util.printTitle("Coleções pt 20 - Map, HashMap, LinkedHashMap pt 03");

        Consumidor c1 = new Consumidor("Anderson");
        Consumidor c2 = new Consumidor("Fabio");

        HQ hq1 = new HQ(5L,"Batman – O cavaleiro das trevas",100.7 , 2);
        HQ hq2 = new HQ(9L,"Reino do amanhã",134.7,3);
        HQ hq3 = new HQ(1L,"Watchmen" , 19.9,4);
        HQ hq4 = new HQ(7L,"Crise nas infinitas terras",17.9,0);
        HQ hq5 = new HQ(4L,"Batman – Ano um",1.8,0);
        HQ hq6 = new HQ(2L,"A saga da Fênix Negra",20.9,5);
        HQ hq7 = new HQ(6L,"All star Superman",15.7,10);
        HQ hq8 = new HQ(8L,"Sandman – Estação das brumas",41.6,20);
        HQ hq9 = new HQ(10L,"Maus – A história de um sobrevivente",1000.5,1);
        HQ hq10 = new HQ(3L,"Born again (Demolidor)",25.5,1);

        Map<Consumidor , List<HQ>> consumidorHQMap = new HashMap<>();
        List<HQ> hqC1 = List.of(hq1,hq4,hq5,hq7,hq10);
        List<HQ> hqC2 = List.of(hq1,hq2,hq3,hq5,hq6,hq7,hq8,hq9);
        consumidorHQMap.put(c1 ,hqC1);
        consumidorHQMap.put(c2 ,hqC2);

        for(Map.Entry<Consumidor,List<HQ>> entry : consumidorHQMap.entrySet()){
            System.out.println(entry.getKey().getNome());
            System.out.println("------------------------------");
            for (HQ hq :
                    entry.getValue()) {
                System.out.println(hq);
            }
            System.out.println();
        }


    }
}
