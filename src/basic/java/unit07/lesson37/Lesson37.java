package basic.java.unit07.lesson37;

import basic.java.util.Util;

public class Lesson37 {
    public static void main(String[] args) {
        Util.printTitle("Exceções pt 01 - Errors");

        //criando um erro do tipo StackOverFlowError com um método recursivo.
        recursividade();

    }

    public static void recursividade(){
        System.out.println("Recursividade");
        recursividade();
    }
}
