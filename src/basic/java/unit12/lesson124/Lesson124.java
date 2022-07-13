package basic.java.unit12.lesson124;

import basic.java.util.Util;

class Animal{
    public void walk(){
        System.out.println("Animal Walking");
    }
}

class Cachorro extends Animal{
    @Override
    public void walk() {
        System.out.println("Cachorro Walking");
    }
}

public class Lesson124 {
    public static void main(String[] args) {
        Util.printTitle("Classes Internas pt 03 - Classes Anônimas");

        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}
