package basic.java.unit10.lesson96;

import basic.java.util.Util;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        if(file.getFileName().toString().endsWith(".java")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class Lesson96 {
    public static void main(String[] args) throws IOException {

        Util.printTitle("Classes Utilitárias - NIO pt 11 - SimpleFileVisitor pt 01");

        Path root = Paths.get(".");
        Files.walkFileTree(root ,new ListAllFiles());

    }
}
