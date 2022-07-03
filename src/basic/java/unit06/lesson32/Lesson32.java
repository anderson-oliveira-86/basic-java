package basic.java.unit06.lesson32;

import basic.java.util.Util;

import java.sql.SQLOutput;

public class Lesson32 {
    public static void main(String[] args) {
        Util.printTitle("Orientação Objetos - Enumeração");

        Cliente goku = new Cliente("Goku" , TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);

        Cliente corporacaoCapsule = new Cliente("Corporacao Capsule" , TipoCliente.PESSOA_JURIDICA , TipoPagamento.DEBITO);

        System.out.println(goku);
        System.out.println(corporacaoCapsule);

        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.porNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente);


    }
}
