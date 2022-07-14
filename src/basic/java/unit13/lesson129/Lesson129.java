package basic.java.unit13.lesson129;

import basic.java.unit13.lesson127.Car;
import basic.java.util.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lesson129 {

    private static List<Car> carList = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );

    public static void main(String[] args) {
        Util.printTitle("Parametrizando comportamentos pt 02");

        List<Car> filtered2 = filter(carList, car -> car.getColor().equals("black"));
        System.out.println(filtered2);

        // Predicate na forma simplificada com Lambda (year)
        List<Car> filtered3 = filter(carList, car -> car.getYear() < 2015);
        System.out.println(filtered3);

        //Utilizando a Classe Predicate do pacote java.util.function
        List<Car> filtered4 = filter(carList, car -> car.getColor().equals("red"));
        System.out.println(filtered4);

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums, num -> num % 2 == 0));

    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e :
                list) {
            if(predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
