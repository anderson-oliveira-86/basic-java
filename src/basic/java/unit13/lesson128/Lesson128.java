package basic.java.unit13.lesson128;

import basic.java.unit13.lesson127.Car;
import basic.java.util.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lesson128 {

    private static List<Car> carList = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );

    public static void main(String[] args) {

        Util.printTitle("Parametrizando comportamentos pt 02");

        // Predicate na forma integral e mais complexa
        List<Car> filtered = filter(carList, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });
        System.out.println(filtered);

        // Predicate na forma simplificada com Lambda (color)
        List<Car> filtered2 = filter(carList, car -> car.getColor().equals("black"));
        System.out.println(filtered2);

        // Predicate na forma simplificada com Lambda (year)
        List<Car> filtered3 = filter(carList, car -> car.getYear() < 2015);
        System.out.println(filtered3);

        //Utilizando a Classe Predicate do pacote java.util.function
        List<Car> filtered4 = filterPredicate(carList, car -> car.getColor().equals("red"));
        System.out.println(filtered4);

    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterPredicate(List<Car> cars, Predicate<Car> predicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (predicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
