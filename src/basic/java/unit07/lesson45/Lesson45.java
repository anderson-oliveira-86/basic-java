package basic.java.unit07.lesson45;

import basic.java.util.Util;

import java.io.*;

public class Lesson45 {
    public static void main(String[] args) {
        Util.printTitle("Exceções pt 09 - Try with resources");

        lerArquivo3();

    }

    // forma incorreta
    public static void lerArquivo(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Utilizando Try with resource
    // Para o utilizar Try with resources é necessário que sejam exceções que implementes Closeable ou Autocloseable
    public static void lerArquivo2(){
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){
            System.out.println("executando");
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void lerArquivo3(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){
            System.out.println("executando");
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
