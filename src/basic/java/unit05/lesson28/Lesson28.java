package basic.java.unit05.lesson28;

import basic.java.util.Util;

public class Lesson28 {
    public static void main(String[] args) {
        Util.printTitle("Orientação Objetos - Herança");

        Endereco endereco = new Endereco("Rua Tapajós" , 1001 , "01234-567");

        System.out.println("Testando os blocos de inicialização da classe Funcionario" +
                "\ne a herança da classe Pessoa" +
                "\n#########################################################\n");
        Funcionario funcionario = new Funcionario("Pedrinho" , "123.456.789-01");

        funcionario.setEndereco(endereco);
        funcionario.setSalario(5000);

        System.out.println("\nImprimindo o funcionário\n#########################################################");
        funcionario.imprimir();
    }
}
