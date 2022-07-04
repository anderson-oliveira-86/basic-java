package basic.java.unit06.lesson35;

public class Televisao extends Produto{

    public static final double IMPOSTO = 0.21;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando o imposto do computador");
        return this.valor * IMPOSTO;
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
