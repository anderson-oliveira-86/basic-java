package basic.java.unit04.lesson25;

import basic.java.unit04.lesson24.Jogador;
import basic.java.util.Util;

public class Lesson25 {
    public static void main(String[] args) {
        Util.printTitle("Orientação Objetos - Associação unidirecional (um para muitos)");

        Player player1 = new Player("John Snow");
        Team teamStark = new Team("Stark");
        player1.setTeam(teamStark);

        System.out.println(player1);
    }
}
