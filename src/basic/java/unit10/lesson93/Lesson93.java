package basic.java.unit10.lesson93;

import basic.java.util.Util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class Lesson93 {
    public static void main(String[] args) throws IOException {
        Util.printTitle("Classes Utilitárias - NIO pt 08 - DosFileAttribute");

        Path path = Paths.get("pasta/teste.txt");
        if(Files.notExists(path)){
            Files.createFile(path);
        }
        Files.setAttribute(path,"dos:hidden" , false);
        Files.setAttribute(path,"dos:readonly" , false);

        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden());
        System.out.println(dosFileAttributes.isReadOnly());

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);

        System.out.println(fileAttributeView.readAttributes().isHidden());
        System.out.println(fileAttributeView.readAttributes().isReadOnly());
    }
}
