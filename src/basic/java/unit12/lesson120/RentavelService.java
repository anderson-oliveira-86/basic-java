package basic.java.unit12.lesson120;

import basic.java.unit12.lesson119.Car;

import java.util.ArrayList;
import java.util.List;

public class RentavelService <T>{
    private List<T> objectList;

    public RentavelService(List<T> objectList) {
        this.objectList = objectList;
    }

    public T retrieveAvailableObject(){
        System.out.println("Buscando objeto disponível.... ");
        T t = objectList.remove(0);
        System.out.println("Alugando objeto : " + t);
        System.out.println("Objetos disponível para alugar : ");
        System.out.println(objectList);
        return t;
    }

    public void returnCar(T t){
        System.out.println("Devolvendo objeto : " + t);
        objectList.add(t);
        System.out.println("Objetos disponível para alugar : ");
        System.out.println(objectList);
    }

}
