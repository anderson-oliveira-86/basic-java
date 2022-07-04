package basic.java.unit07.lesson40;

import basic.java.util.Util;

public class Lesson40 {
    public static void main(String[] args) {
        Util.printTitle("Exceções pt 04 - Lançando exceção unchecked");

            // lançando ArithmeticException
            divisao(10 , 0);
    }

    private static int divisao(int a , int b){
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser zero");
        }
        return a/b;
    }
}
