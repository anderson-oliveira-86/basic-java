package basic.java.unit06.lesson34;

import javax.xml.crypto.Data;

public class FileLoader implements DataLoader , DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissão em um arquivo");
    }
}
