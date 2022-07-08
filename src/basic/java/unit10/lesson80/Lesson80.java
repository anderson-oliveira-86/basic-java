package basic.java.unit10.lesson80;

import basic.java.util.Util;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class Lesson80 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - IO pt 01 - File");

        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);
            System.out.println("path " + file.getPath());
            System.out.println("path absolute " + file.getAbsolutePath());
            System.out.println("is directory " + file.isDirectory());
            System.out.println("is file " + file.isFile());
            System.out.println("is hidden " + file.isHidden());
            System.out.println("last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if(exists){
                boolean isDelete = file.delete();
                System.out.println(isDelete);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
