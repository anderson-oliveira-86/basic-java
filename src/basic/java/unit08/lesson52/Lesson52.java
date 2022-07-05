package basic.java.unit08.lesson52;

import basic.java.util.Util;

public class Lesson52 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - Strings pt 03 - Desempenho");

        long inicio = System.currentTimeMillis();
        concatenaString(30000);
        long fim = System.currentTimeMillis();
        System.out.println( "Tempo gasto para String : " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatenaStringBuilder(30000);
        fim = System.currentTimeMillis();
        System.out.println( "Tempo gasto para StringBuilder : " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatenaStringBuffer(30000);
        fim = System.currentTimeMillis();
        System.out.println( "Tempo gasto para StringBuffer : " + (fim - inicio) + "ms");

    }

    private static void concatenaString(int tamanho){

        String texto = "";

        for (int i = 0; i < tamanho; i++) {
            texto = texto + i;
        }
    }


    private static void concatenaStringBuilder(int tamanho){

        StringBuilder sb = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatenaStringBuffer(int tamanho){

        StringBuffer sb = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
