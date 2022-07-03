package basic.java.unit05.lesson28;

import basic.java.util.Util;

public class Lesson28 {
    public static void main(String[] args) {
        Util.printTitle("Orientação Objetos - Herança");

        Endereco endereco = new Endereco("Rua Tapajós" , 1001 , "01234-567");

        Funcionario funcionario = new Funcionario("Pedrinho");
        funcionario.setCpf("123.456.789-01");

        funcionario.setEndereco(endereco);
        funcionario.setSalario(5000);

        funcionario.imprimir();
    }
}
