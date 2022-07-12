package basic.java.unit12.lesson118;

import basic.java.util.Util;

import java.util.List;

abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal{

    @Override
    public void consulta() {
        System.out.println("consultando cachorro");
    }
}

class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("consultando gato");
    }
}
public class Lesson118 {
    public static void main(String[] args) {
        Util.printTitle("Generics pt 02 - Wildcard pt 01");

        List<Cachorro> cachorros = List.of(new Cachorro() , new Cachorro());
        List<Gato> gatos = List.of(new Gato() , new Gato());

    }

    //Type erasure
    // Wildcard == ?
    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal :
                animals) {
            animal.consulta();
        }

    }

    private static void printConsultaAnimal(List<? super Animal> animals){

    }
}