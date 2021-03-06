package basic.java.unit12.lesson117;

import basic.java.util.Util;

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
public class Lesson117 {
    public static void main(String[] args) {
        Util.printTitle("Generics pt 02 - Wildcard pt 01");

        Cachorro[] cachorros = {new Cachorro() , new Cachorro()};
        Gato[] gatos = {new Gato() , new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);

    }

    private static void printConsulta(Animal[] animals){
        for (Animal animal :
                animals) {
            animal.consulta();
        }
        animals[1] = new Gato();
    }
}
