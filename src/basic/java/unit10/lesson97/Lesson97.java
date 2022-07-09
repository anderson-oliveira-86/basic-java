package basic.java.unit10.lesson97;

import basic.java.util.Util;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("[pre visit] " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("[post visit] " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class Lesson97 {

    public static void main(String[] args) throws IOException {

        Util.printTitle("Classes Utilitárias - NIO pt 12 - SimpleFileVisitor pt 02");

        Path root = Paths.get("pasta");
        Files.walkFileTree(root, new ListAllFiles());

    }
}
