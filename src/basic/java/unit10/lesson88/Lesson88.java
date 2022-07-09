package basic.java.unit10.lesson88;

import basic.java.util.Util;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Lesson88 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - NIO pt 03 - Normalização");

        // home/william/dev
        String diretorioProjeto = "home/william/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
    }
}
