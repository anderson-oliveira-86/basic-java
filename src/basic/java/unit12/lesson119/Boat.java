package basic.java.unit12.lesson119;

public class Boat {
    private String nome;

    public Boat(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
