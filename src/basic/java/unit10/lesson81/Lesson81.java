package basic.java.unit10.lesson81;

import basic.java.util.Util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson81 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - IO pt 02 - FileWriter");

        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file)){ //cria ou  sobrescreve o arquivo
            fw.write("O DevDojo é o melhor curso do Brasil!\nPulando a linha !!!!");
            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file2 = new File("file2.txt");

        try (FileWriter fw = new FileWriter(file2 , true)){ // adicionando ao arquivo existente
            fw.write("O DevDojo é o melhor curso do Brasil!\nPulando a linha !!!!");
            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
