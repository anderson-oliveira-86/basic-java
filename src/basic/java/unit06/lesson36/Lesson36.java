package basic.java.unit06.lesson36;

import basic.java.util.Util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson36 {
    public static void main(String[] args) {
        Util.printTitle("Orientação Objetos - Polimorfismo pt 05 - Programação orientada a interface");


//        Repositorio repositorio = new RepositorioBancoDeDados();
//        Repositorio repositorio = new RepositorioArquivo();
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

//        List<String> lista = new ArrayList<>();
        List<String> lista =  new LinkedList<>();
        lista.add("Goku");
        lista.add("Vegeta");
        lista.add("Kuririn");
    }
}
