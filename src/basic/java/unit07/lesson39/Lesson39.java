package basic.java.unit07.lesson39;

import basic.java.util.Util;

import java.io.File;
import java.io.IOException;

public class Lesson39 {
    public static void main(String[] args) {
        Util.printTitle("Exceções pt 03 - Exception");

        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){

        File file = new File("arquivo\\test.txt");

        try {
            boolean criado = file.createNewFile();
            System.out.println("Arquivo criado " + criado);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
