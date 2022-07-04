package basic.java.unit06.lesson34;

import basic.java.util.Util;

public class Lesson34 {
    public static void main(String[] args) {
        Util.printTitle("Orientação Objetos - Interfaces pt 01 - Introdução");

        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
    }
}
