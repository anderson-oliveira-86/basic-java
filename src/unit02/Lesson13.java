package unit02;

import util.Util;

public class Lesson13 {
    public static void main(String[] args) {
        Util.printTitle("Estrutura de Repetição - Continue");

        double valorTotal = 30000;

        for (double parcela = valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 2000){
                continue;
            }
            System.out.println("Prestações : " + parcela + " - Valor da parcela R$ " + valorParcela);
        }

    }
}
