package basic.java.unit07.lesson43;

import basic.java.util.Util;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Lesson43 {
    public static void main(String[] args) {
        Util.printTitle("Exceções pt 07 - Capturando múltiplas exceções");

        try {
            throw new IndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void talvezLanceException() throws SQLException , FileNotFoundException {

    }
}
