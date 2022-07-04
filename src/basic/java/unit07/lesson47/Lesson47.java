package basic.java.unit07.lesson47;

import basic.java.unit07.lesson46.LoginInvalidoException;
import basic.java.util.Util;

import java.io.FileNotFoundException;

public class Lesson47 {
    public static void main(String[] args) {
        Util.printTitle("Exceções pt 11 - Exceção e regras de sobrescrita");

        Worker worker = new Worker();

        try {
            worker.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
