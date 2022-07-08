package basic.java.unit10.lesson87;

import basic.java.util.Util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Lesson87 {
    public static void main(String[] args) throws IOException {
        Util.printTitle("Classes Utilitárias - NIO pt 02 - Path, Paths, Files pt 02");

        Path pastaPath = Paths.get("pasta");//new File("pasta");
        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }

        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDirectories = Files.createDirectories(subPastaPath);
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString() , "file_renamed.txt");
        Files.copy(source , target , StandardCopyOption.REPLACE_EXISTING);

    }
}
