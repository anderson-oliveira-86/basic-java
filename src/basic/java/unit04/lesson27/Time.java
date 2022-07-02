package basic.java.unit04.lesson27;

import java.util.Arrays;

public class Time {
    private String name;
    private Atleta[] atletas;

    public void imprimir(){
        System.out.println("Time : " + this.name +
                "\nLista de Jogadores :");
        for (Atleta atleta :
                atletas) {
            System.out.println(atleta.getName());
        }
    }
    public Time(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Atleta[] getAtletas() {
        return atletas;
    }

    public void setAtletas(Atleta[] atletas) {
        this.atletas = atletas;
    }

}
