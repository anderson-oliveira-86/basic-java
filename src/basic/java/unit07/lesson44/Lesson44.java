package basic.java.unit07.lesson44;

import basic.java.util.Util;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Lesson44 {
    public static void main(String[] args) {
        Util.printTitle("Exceções pt 08 - Multi catch em linha");

        try {
            throw new IndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (RuntimeException e){
            System.out.println("por exemplo uma Exception não prevista - Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void talvezLanceException() throws SQLException , FileNotFoundException {

    }
}
