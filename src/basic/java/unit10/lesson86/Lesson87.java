package basic.java.unit10.lesson86;

import basic.java.util.Util;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Lesson87 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - NIO pt 01 - Path, Paths, Files pt 01");

        Path p1 = Paths.get("C:\\Users\\ander\\IdeaProjects\\basic-java\\file.txt");
        Path p2 = Paths.get("C:\\Users\\ander\\IdeaProjects\\basic-java","file.txt");
        Path p3 = Paths.get("C:","Users\\ander\\IdeaProjects\\basic-java","file.txt");
        Path p4 = Paths.get("C:","Users","ander","IdeaProjects","basic-java","file.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
