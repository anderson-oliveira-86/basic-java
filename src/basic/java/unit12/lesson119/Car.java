package basic.java.unit12.lesson119;

public class Car {
    private String nome;

    public Car(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
