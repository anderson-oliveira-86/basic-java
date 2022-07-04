package basic.java.unit07.lesson42;

import basic.java.util.Util;

public class Lesson42 {
    public static void main(String[] args) {
        Util.printTitle("Exceções pt 06 - Bloco Finally");

        String resposta = simulandoConexao();
        System.out.println(resposta);

    }

    private static String simulandoConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquvio");
            return "Dados escritos com sucesso no arquivo";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo sistema operacional");
        }
        return null;
    }
}
