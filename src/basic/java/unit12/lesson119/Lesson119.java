package basic.java.unit12.lesson119;

public class Lesson119 {
    public static void main(String[] args) {
        CarRentavelService serviceCar = new CarRentavelService();
        Car car = serviceCar.retrieveAvailableCar();
        System.out.println("Usando o carro por um mês... ");
        serviceCar.returnCar(car);
        System.out.println("\n################################\n");
        BoatRentavelService serviceBoat = new BoatRentavelService();
        Boat boat = serviceBoat.retrieveAvailableCar();
        System.out.println("Usando o barco por um mês... ");
        serviceBoat.returnCar(boat);

    }
}
