package basic.java.unit10.lesson94;

import basic.java.util.Util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class Lesson94 {
    public static void main(String[] args) throws IOException {

        // 152 - Classes Utilitárias - NIO pt 09 - PosixFileAttributes

        // obs.: a classe PosixFileAttributeView só é suportada por SO Unix, no Windows ela lança uma exceção.
        // os testes foram realizados no ubunto e estão OK

        Path path = Paths.get("/home/anderson/dev/file.txt");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posixFileAttributes.permissions());

        PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rw-rw-rw-");
        fileAttributeView.setPermissions(posixFilePermissions);
        System.out.println(fileAttributeView.readAttributes().permissions());
    }
}
