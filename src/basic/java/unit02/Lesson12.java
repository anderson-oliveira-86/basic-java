package basic.java.unit02;

import basic.java.util.Util;

public class Lesson12 {
    public static void main(String[] args) {

        Util.printTitle("Estrutura de Repetição - Break");

        // Parar a estrutura de repetição com o Break
        int valueMax = 10;

        for (int i = 0; i < valueMax; i++) {

            if(i > 5){
                break;
            }
            System.out.println("i : " + i);
        }
        System.out.println("Fim do laço\n");

        // Dado o valor de um carro, descubra em quantas prestações ele pode ser parcelado
        // condição -> valor da parcela deve ser superior a R$ 2.000,00
        double valorCarro = 30000;
        System.out.println("Condição de pagamento do Carro de R$ " + valorCarro);
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 2000){
                break;
            }
            System.out.println("Prestações : " + parcela + " - Valor da parcela R$ " + valorParcela);
        }

    }
}
