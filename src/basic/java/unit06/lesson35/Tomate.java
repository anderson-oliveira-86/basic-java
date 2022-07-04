package basic.java.unit06.lesson35;

public class Tomate extends Produto{
    private static final double IMPOSTO = 0.06;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando o imposto do tomate");
        return this.valor * IMPOSTO;
    }
}
