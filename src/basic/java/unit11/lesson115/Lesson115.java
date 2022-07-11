package basic.java.unit11.lesson115;

import basic.java.unit11.lesson113.Consumidor;
import basic.java.util.Util;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Lesson115 {
    public static void main(String[] args) {
        Util.printTitle("Coleções pt 21 - NavigableMap, TreeMap");

        Consumidor c1 = new Consumidor("Anderson");
        Consumidor c2 = new Consumidor("Fabio");

        NavigableMap<String , String> map = new TreeMap<>();
        map.put("A" , "Letra A");
        map.put("D" , "Letra D");
        map.put("B" , "Letra B");
        map.put("C" , "Letra C");
        map.put("E" , "Letra E");

        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


        System.out.println(map.headMap("C"));
        System.out.println(map.headMap("C" , true));

        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.lowerKey("C"));
        System.out.println(map.floorKey("C"));
    }
}
