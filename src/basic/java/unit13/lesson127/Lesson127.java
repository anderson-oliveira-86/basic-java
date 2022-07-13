package basic.java.unit13.lesson127;

import basic.java.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Lesson127 {
    private static List<Car> carList = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );
    public static void main(String[] args) {
        Util.printTitle("Parametrizando comportamentos pt 01");

        System.out.println(filterCar(carList, "green"));
        System.out.println(filterCar(carList, "red"));
        System.out.println(filterAge(carList, 2017));

    }

    public static List<Car> filterCar(List<Car> cars , String color) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car :
                cars) {
            if (car.getColor().equals(color)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    public static List<Car> filterAge(List<Car> cars , int year) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car :
                cars) {
            if (car.getYear() < year) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
