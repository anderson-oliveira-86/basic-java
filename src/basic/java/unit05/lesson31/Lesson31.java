package basic.java.unit05.lesson31;

import basic.java.unit05.lesson30.Veiculo;

public class Lesson31 {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();
        Comprador comprador = veiculo.COMPRADOR;
        System.out.println(veiculo.COMPRADOR);
        comprador.setNome("Kuririn");
        System.out.println(veiculo.COMPRADOR);

    }
}
