package basic.java.unit04.lesson27;

import basic.java.util.Util;

public class Lesson27 {

    public static void main(String[] args) {
        Util.printTitle("Orientação Objetos - Associação bidirecional");

        Time time = new Time("Seleção Brasileira");
        Atleta atleta1 = new Atleta("Pelé" , time);
        Atleta atleta2 = new Atleta("Cafu" , time);
        Atleta atleta3 = new Atleta("Romario" , time);


        Atleta[] atletas = new Atleta[]{atleta1 , atleta2 , atleta3};
        time.setAtletas(atletas);

        time.imprimir();
        System.out.println("\n#####################################\n");
        atleta1.imprimir();
        atleta2.imprimir();
        atleta3.imprimir();
    }
}
