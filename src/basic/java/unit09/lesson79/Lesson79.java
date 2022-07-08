package basic.java.unit09.lesson79;

import basic.java.util.Util;

import java.util.Scanner;

public class Lesson79 {
    public static void main(String[] args) {
        Util.printTitle("Classes Utilitárias - Scanner - Tokens e Delimitadores");

        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        
        while (scanner.hasNext()){

            if(scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Int : " + i);
            }else if(scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean : " + b);
            }else{
                System.out.println(scanner.next());
            }
        }
    }
}
