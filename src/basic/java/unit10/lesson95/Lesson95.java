package basic.java.unit10.lesson95;

import basic.java.util.Util;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lesson95 {
    public static void main(String[] args) {

        Util.printTitle("Classes Utilitárias - NIO pt 10 - DirectoryStream");

        Path dir = Paths.get(".");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            for (Path path :
                    stream) {
                System.out.println(path.getFileName());
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
