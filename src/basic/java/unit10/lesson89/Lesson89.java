package basic.java.unit10.lesson89;

import basic.java.util.Util;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Lesson89 {

    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - NIO pt 04 - Resolvendo Paths");

        Path dir = Paths.get("home/william");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absolute = Paths.get("/home/william");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");
        System.out.println("1 " + absolute.resolve(relativo));
        System.out.println("2 " + absolute.resolve(file));
        System.out.println("3 " + relativo.resolve(absolute));
        System.out.println("4 " + relativo.resolve(file));


    }
}
