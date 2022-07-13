package basic.java.unit12.lesson126;

import basic.java.util.Util;

public class Lesson126 {

    private String name = "Anderson";
    static class Nested{
        private String lastName = "Oliveira";
        void print(){
            System.out.println(new Lesson126().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Util.printTitle("Classes Internas pt 04 - Classes aninhadas estáticas");

        Nested nested = new Nested();
        nested.print();

    }
}
