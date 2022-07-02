package basic.java.unit04.lesson27;

import basic.java.unit04.lesson25.Team;

public class Atleta {

    private String name;
    private Time time;

    public void imprimir(){
        System.out.println("Jogador : " + this.name +
                "\nTime : " + this.time.getName() +
        "\n");
    }
    public Atleta(String name, Time time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }



}
