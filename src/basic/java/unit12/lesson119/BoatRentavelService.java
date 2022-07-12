package basic.java.unit12.lesson119;

import java.util.ArrayList;
import java.util.List;

public class BoatRentavelService {
    private List<Boat> carList = new ArrayList<>(
            List.of(new Boat("Lanche") ,
                    new Boat("Canoa")));

    public Boat retrieveAvailableCar(){
        System.out.println("Buscando barco disponível.... ");
        Boat boat = carList.remove(0);
        System.out.println("Alugando barco : " + boat);
        System.out.println("Barcos disponível para alugar : ");
        System.out.println(carList);
        return boat;
    }

    public void returnCar(Boat boat){
        System.out.println("Devolvendo barco : " + boat);
        carList.add(boat);
        System.out.println("Barcos disponível para alugar : ");
        System.out.println(carList);
    }

}
