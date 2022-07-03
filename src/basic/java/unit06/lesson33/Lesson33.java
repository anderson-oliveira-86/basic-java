package basic.java.unit06.lesson33;

import basic.java.util.Util;

public class Lesson33 {
    public static void main(String[] args) {
        Util.printTitle("Orientação Objetos - Classes abstratas");

        Manager bulman = new Manager("Bulman" , 5000);
        System.out.println(bulman);

        Developer developer = new Developer("Anderson" , 1000);
        System.out.println(developer);
    }
}
