package basic.java.unit10.lesson100;

import basic.java.util.Util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lesson100 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - Serialization pt 01");

        Aluno aluno = new Aluno(1L , "Anderson" , "123456");

        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){

            oos.writeObject(aluno);

        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }
    }
}
