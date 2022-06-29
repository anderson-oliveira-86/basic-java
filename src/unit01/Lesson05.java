package unit01;

import util.Util;

public class Lesson05 {
    public static void main(String[] args) {

        Util.printTitle("Operador Lógico OR (||)");

        System.out.println("Simulação de um sistema de vacinação gratuita\n" +
                "que verifica se a idade do paciente é maior que 65 anos\n" +
                "ou tem a renda menor que um salário mínimo (R$ 1.212,00)\n");

        //OR (true || true)
        logicalOperator(70 , 1000.0);

        //OR (true || false)
        logicalOperator(70 , 5000.0);

        //OR (false || true)
        logicalOperator(35 , 1000.0);

        //OR (false || false)
        logicalOperator(35 , 5000.0);


    }

    private static void logicalOperator(int idade, double renda) {
        boolean result = idade > 65 || renda < 1212.0;
        System.out.println("Com idade de " + idade + " e renda de " + renda + "" +
                ". Eu posso ser vacinado gratuitamente?\nResposta: " + result + "\n");
    }
}
