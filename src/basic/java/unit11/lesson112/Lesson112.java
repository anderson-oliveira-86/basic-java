package basic.java.unit11.lesson112;

import basic.java.util.Util;

import java.util.HashMap;
import java.util.Map;

public class Lesson112 {
    public static void main(String[] args) {
        Util.printTitle("Coleções pt 18 - Map, HashMap, LinkedHashMap pt 01");

        Map<String,String> map = new HashMap<>();
        map.put("teklado","teclado");
        map.put("mouze","mouse");
        map.put("vc","você");
        map.putIfAbsent("vc","você2");
        System.out.println(map);

        System.out.println("\n#####################\n");

        for (String key :
                map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("\n#####################\n");

        for (String value :
                map.values()){
            System.out.println("value : " + value);
        }

        System.out.println("\n#####################\n");

        for(Map.Entry<String,String> x :
        map.entrySet()){
            System.out.println(x.getKey() + " : " + x.getValue());
        }
        
    }
}
