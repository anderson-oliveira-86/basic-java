package basic.java.unit07.lesson38;

import basic.java.util.Util;

public class Lesson38 {
    public static void main(String[] args) {
        Util.printTitle("Exceções pt 02 - RuntimeException");

        //Checked e Unchecked
        //Unchecked extends RuntimeException (Exceções em tempo de execução que estende a classe RuntimeException)

        //Lançando NullPointerException
        Object object = null;
        System.out.println(object.toString());

        //Lançando ArrayIndexOutOfBoudsException
        int[] nums = {1 , 2};
        System.out.println(nums[2]);

    }
}
