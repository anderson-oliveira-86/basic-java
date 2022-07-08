package basic.java.unit10.lesson84;

import basic.java.util.Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Lesson84 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - IO pt 05 - BufferedReader");

        File file = new File("file3.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
