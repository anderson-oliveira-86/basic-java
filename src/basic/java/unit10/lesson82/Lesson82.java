package basic.java.unit10.lesson82;

import basic.java.util.Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lesson82 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - IO pt 03 - FileReader");

        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)){
            char[] in = new char[30];
            fr.read(in);

            for (char c :
                    in) {
                System.out.print(c);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        File file2 = new File("file.txt");
        try (FileReader fr = new FileReader(file2)){
            int i;
            while ((i = fr.read()) != -1){
                System.out.print((char)i);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
