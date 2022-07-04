package basic.java.unit07.lesson41;

import basic.java.util.Util;

import java.io.IOException;

public class Lesson41 {
    public static void main(String[] args) throws IOException {
        Util.printTitle("Exceções pt 05 - Lançando exceção checked");

        // lançando ArithmeticException
            divisao(10 , 0);

    }

    public static int divisao(int a , int b) throws IOException{
        try {
            return a/b;
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }

    }
}
