package basic.java.unit10.lesson92;

import basic.java.util.Util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class Lesson92 {
    public static void main(String[] args) throws IOException {

        Util.printTitle("Classes Utilitárias - NIO pt 07 - BasicFileAttributes pt 02");
        Path path = Paths.get("pasta2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("creationTime : " + creationTime);
        System.out.println("lastModifiedTime : " + lastModifiedTime);
        System.out.println("lastAccessTime : " + lastAccessTime);

        // BasicFileAttributesView -> interface
        // DosFileAttributesView -> implementação para Windows
        // PosixFileAttributesView -> implementação para Unix

//        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        basicFileAttributeView.setTimes(lastModifiedTime , newCreationTime , creationTime);

        creationTime = basicFileAttributeView.readAttributes().creationTime();
        lastModifiedTime = basicFileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = basicFileAttributeView.readAttributes().lastAccessTime();

        System.out.println("creationTime : " + creationTime);
        System.out.println("lastModifiedTime : " + lastModifiedTime);
        System.out.println("lastAccessTime : " + lastAccessTime);

    }
}
