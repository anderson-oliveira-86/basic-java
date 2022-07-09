package basic.java.unit10.lesson98;

import basic.java.util.Util;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class Lesson98 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - NIO pt 13 - PathMatcher pt 01");

        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");

        matches(path1 , "glob:*.bkp");
        matches(path1 , "glob:**.bkp");
        matches(path1 , "glob:**/*.bkp");
        matches(path1 , "glob:**/*.{bkp,txt,java}");
        matches(path2 , "glob:**/*.{bkp,txt,java}");
        matches(path3 , "glob:**/*.{bkp,txt,java}");
        matches(path1 , "glob:**/file.???");

    }

    private static void matches(Path path , String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + " : " + matcher.matches(path));
    }
}
