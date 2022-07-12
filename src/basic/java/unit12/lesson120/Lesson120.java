package basic.java.unit12.lesson120;

import basic.java.unit12.lesson119.Boat;
import basic.java.unit12.lesson119.Car;
import basic.java.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Lesson120 {
    public static void main(String[] args) {
        Util.printTitle("Generics pt 05 - Classes Genéricas pt 02");

        List<Car> carList = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));
        List<Boat> boatList = new ArrayList<>( List.of(new Boat("Lancha") , new Boat("Canoa")));

        RentavelService<Car> carRentavelService = new RentavelService<>(carList);
        RentavelService<Boat> boatRentavelService = new RentavelService<>(boatList);

        Car car = carRentavelService.retrieveAvailableObject();
        System.out.println("Alugando carro : " + car);
        System.out.println("Carros disponível para alugar : ");
        carRentavelService.returnCar(car);
        System.out.println(carList);
        System.out.println("\n################################\n");
        Boat boat = boatRentavelService.retrieveAvailableObject();
        System.out.println("Alugando carro : " + boat);
        System.out.println("Carros disponível para alugar : ");
        boatRentavelService.returnCar(boat);
        System.out.println(boatList);


    }
}
