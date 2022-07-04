package basic.java.unit06.lesson35;

public class Tomate extends Produto{
    private static final double IMPOSTO = 0.06;
    private String dataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando o imposto do tomate");
        return this.valor * IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Tomate{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
