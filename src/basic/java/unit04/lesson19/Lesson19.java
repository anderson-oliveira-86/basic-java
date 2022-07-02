package basic.java.unit04.lesson19;

import basic.java.util.Util;

public class Lesson19 {
    public static void main(String[] args) {
        Util.printTitle("Orientação Objetos - Fundamentos Básicos");

        // referemcia na memória = instanciação() do objeto
        Estudante estudante = new Estudante("João" , 14 , "Ricardo", "11 4567-7890" , "Avenida Brasil");

        estudante.imprime();

    }
}
