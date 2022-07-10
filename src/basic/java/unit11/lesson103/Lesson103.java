package basic.java.unit11.lesson103;

import basic.java.unit11.lesson101.Smartphone;
import basic.java.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Lesson103 {
    public static void main(String[] args) {
        Util.printTitle("Coleções pt 08 - List pt 03");

        Smartphone s0 = new Smartphone("SN-00" , "Samsung Galaxy S22 Ultra");
        Smartphone s1 = new Smartphone("SN-01" , "Apple iPhone 12 Pro Max");
        Smartphone s2 = new Smartphone("SN-02" , "ASUS Zenfone 8");
        Smartphone s3 = new Smartphone("SN-03" , "Huawei P30 PRO");
        Smartphone s4 = new Smartphone("SN-04" , "Xiaomi MI 10 pro");
        Smartphone s5 = new Smartphone("SN-05" , "Philco Hit Plus");


        List<Smartphone> smartphoneList = new ArrayList<>(12);
        smartphoneList.add(s0);
        smartphoneList.add(s1);
        smartphoneList.add(s2);
        smartphoneList.add(s3);
        smartphoneList.add(s4);
        smartphoneList.add(s5);

        System.out.println("Lista de Smartphone");
        for (Smartphone smartphone :
                smartphoneList) {
            System.out.println(smartphone);
        }

        System.out.println("\nLista de Smartphone removendo ASUS Zenfone 8");
        smartphoneList.remove(s2);
        for (Smartphone smartphone :
                smartphoneList) {
            System.out.println(smartphone);
        }

        Smartphone s6 = new Smartphone("SN-05" , "Marca diferente");
        Smartphone s7 = new Smartphone("SN-erro" , "Philco Hit Plus");

        System.out.println("\nContains (com marca diferente e serialNumber igual) "+ smartphoneList.contains(s6));

        //utilizando o equals personalizado que identifica o serialNumber igual
        System.out.println("Contains (com marca igual e serialNumber diferente) "+ smartphoneList.contains(s7));

        System.out.println("Retornando o indice do objeto que for igual (Equals) " + smartphoneList.indexOf(s6));

        System.out.println("\nLista de Smartphone adicionando na posição 1 o Nokia Tijolo");
        Smartphone s8 = new Smartphone("SN-06" , "Nokia tijolo");
        smartphoneList.add(1,s8);
        for (Smartphone smartphone :
                smartphoneList) {
            System.out.println(smartphone);
        }



    }
}
