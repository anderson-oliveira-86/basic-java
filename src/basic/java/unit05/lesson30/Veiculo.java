package basic.java.unit05.lesson30;

import basic.java.unit05.lesson31.Comprador;

public class Veiculo {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
