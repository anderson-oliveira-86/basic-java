package basic.java.unit10.lesson85;

import basic.java.util.Util;

import java.io.File;
import java.io.IOException;

public class Lesson86 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - IO pt 06 - File para diretórios");

        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);
        File fileArquivoDiretorio = new File(fileDiretorio , "arquivo.txt");
        boolean isCreateNewFile = false;
        try {
            isCreateNewFile = fileArquivoDiretorio.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(isCreateNewFile);

        File fileRenamed = new File(fileDiretorio ,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

    }
}
