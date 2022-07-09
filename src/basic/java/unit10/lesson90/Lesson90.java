package basic.java.unit10.lesson90;

import basic.java.util.Util;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Lesson90 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - NIO pt 05 - Relativize");

        Path dir = Paths.get("/home/william");
        Path clazz = Paths.get("/home/william/devdojofoda/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto1 = Paths.get("/home/william");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("home/williamdevdojofoa/OlaMundo.java");
        Path relatiov1 = Paths.get("temp");
        Path relatiov2 = Paths.get("temp/temp.2021921");

//        System.out.println("1 " + absoluto1.relativize(absoluto3));
//        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("3 " + absoluto1.relativize( absoluto2));
        System.out.println("4 " + relatiov1.relativize(relatiov2));
    }
}
