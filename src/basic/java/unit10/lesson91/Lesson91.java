package basic.java.unit10.lesson91;

import basic.java.util.Util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Lesson91 {
    public static void main(String[] args) throws IOException {
        Util.printTitle("Classes Utilitárias - NIO pt 06 - BasicFileAttributes pt 01");

        // BasicFileAttributes -> interface
        // DosFileAttributes -> implementação para Windows
        // PosixFileAttributes -> implementação para Unix

        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("pasta2/novo.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("pasta2/novo_path.txt");
//        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path , fileTime);
        System.out.println("isWritable " + Files.isWritable(path));
        System.out.println("isReadable " + Files.isReadable(path));
        System.out.println("isExecutable " + Files.isExecutable(path));
    }
}
