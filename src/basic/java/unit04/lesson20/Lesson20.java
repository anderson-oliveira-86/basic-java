package basic.java.unit04.lesson20;

import basic.java.util.Util;

public class Lesson20 {

    public static void main(String[] args) {

        Util.printTitle("Orintação Objetos - Bloco de Inicialização");

        Aluno aluno = new Aluno();
        aluno.setNomeAluno("João");
        aluno.setSerie("6 Série");

        System.out.println("Materias pré carregadas com o bloco de inicialização");
        for (String materia:
                aluno.getMaterias()) {
            System.out.println(materia);
        }

    }
}
