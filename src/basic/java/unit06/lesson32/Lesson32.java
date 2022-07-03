package basic.java.unit06.lesson32;

import basic.java.util.Util;

public class Lesson32 {
    public static void main(String[] args) {
        Util.printTitle("Orientação Objetos - Enumeração pt 01 - Introdução");

        Cliente goku = new Cliente();
        goku.setNome("Goku");
        goku.setTipo(TipoCliente.PESSOA_FISICA);

        Cliente corporacaoCapsule = new Cliente();
        corporacaoCapsule.setNome("Capsule");
        corporacaoCapsule.setTipo(TipoCliente.PESSOA_JURIDICA);

        System.out.println(goku);
        System.out.println(corporacaoCapsule);


    }
}
