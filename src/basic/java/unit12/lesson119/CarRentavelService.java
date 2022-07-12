package basic.java.unit12.lesson119;

import java.util.ArrayList;
import java.util.List;

public class CarRentavelService {
    private List<Car> carList = new ArrayList<>(
            List.of(new Car("BMW") ,
                    new Car("Fusca")));

    public Car retrieveAvailableCar(){
        System.out.println("Buscando carro disponível.... ");
        Car car = carList.remove(0);
        System.out.println("Alugando carro : " + car);
        System.out.println("Carros disponível para alugar : ");
        System.out.println(carList);
        return car;
    }

    public void returnCar(Car car){
        System.out.println("Devolvendo carro : " + car);
        carList.add(car);
        System.out.println("Carros disponível para alugar : ");
        System.out.println(carList);
    }

}
