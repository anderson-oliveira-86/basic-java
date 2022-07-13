package basic.java.unit12.lesson122;

import basic.java.util.Util;

public class Lesson122 {

    private String nome = "Monkey D. Luffy";

    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(nome);
            System.out.println(this);
        }
    }

    public static void main(String[] args) {
        Util.printTitle("Classes Internas pt 01 - Introdução");
        Lesson122 lesson122 = new Lesson122();
        Inner inner1 = lesson122.new Inner();
        inner1.printOuterClassAttribute();

        Lesson122.Inner inner2 = lesson122.new Inner();
        inner2.printOuterClassAttribute();

        Inner inner3 = new Lesson122().new Inner();
        inner3.printOuterClassAttribute();


    }
}
