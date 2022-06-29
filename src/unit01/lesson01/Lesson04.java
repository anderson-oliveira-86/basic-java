package unit01.lesson01;

import util.Util;

public class Lesson04 {

    public static void main(String[] args) {
        Util.printTitle("Operador Lógico AND (&&)");

        System.out.println("Simulação de um sistema de bolsa de estudo para baixa renda\n" +
                "para obter a bolsa é necessário ser menor que 18 anos\n" +
                "e ter renda menor que 2 salários mínimos (R$ 2.424,00)\n");

        // AND (true && true)
        logicalOperator(1500.0 , 10);

        // AND (false && true)
        logicalOperator(3000.0 , 10);

        // AND (true && false)
        logicalOperator(1500.0 , 19);

        // AND (false && false)
        logicalOperator(3000.0 , 19);
    }

    private static void logicalOperator(double salario, int idade) {
        boolean result = salario < 2424.0 && idade < 18;
        System.out.println("Com salario de " + salario + " e idade de " + idade + "" +
                ". Eu posso obter a bolsa de estudo?\nResposta: " + result + "\n");
    }
}
