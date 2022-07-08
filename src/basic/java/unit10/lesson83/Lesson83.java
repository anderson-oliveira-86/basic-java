package basic.java.unit10.lesson83;

import basic.java.util.Util;

import java.io.*;

public class Lesson83 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - IO pt 04 - BufferedWriter");

        File file = new File("file3.txt");

        try (FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("O DevDojo é o melhor curso do Brasil!");
            bw.newLine();
            bw.write("Pulando a linha !!!!");
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
