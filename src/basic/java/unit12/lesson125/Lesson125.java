package basic.java.unit12.lesson125;

import basic.java.unit12.lesson119.Boat;
import basic.java.util.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lesson125 {
    public static void main(String[] args) {
        Util.printTitle("Classes Internas pt 03 - Classes Anônimas");

        List<Boat> boatList = new ArrayList<>();
        Boat canoa = new Boat("Canoa");
        Boat lancha = new Boat("Lancha");
        boatList.add(canoa);
        boatList.add(lancha);

        boatList.sort(new Comparator<Boat>() {
            @Override
            public int compare(Boat o1, Boat o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(boatList);
    }
}
