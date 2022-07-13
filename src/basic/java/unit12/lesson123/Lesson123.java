package basic.java.unit12.lesson123;

import basic.java.util.Util;

public class Lesson123 {

    private String name = "Midorya";

    void print(String param){
        String lastName = "Izuku";
        class LocalClass{
            public void printLocal(){
                System.out.println(param);
                System.out.println(name + lastName);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.printLocal();
        System.out.print("\n");
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {

        Util.printTitle("Classes Internas pt 02 - Classes Locais");
        Lesson123 lesson123 = new Lesson123();
        lesson123.print("Teste");


    }
}
