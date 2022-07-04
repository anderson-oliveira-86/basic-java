package basic.java.unit06.lesson35;

public class Computador extends Produto{

    public static final double IMPOSTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando o imposto do computador");
        return this.valor * IMPOSTO;
    }
}
