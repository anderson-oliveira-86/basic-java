package basic.java.unit08.lesson50;

public class Lesson50 {
    public static void main(String[] args) {

        // String criada no String constant pool (piscina de Strings)
        String nome = "Anderson";
        String nome2 = "Anderson";
        System.out.println("HashCode");
        System.out.println(nome.hashCode());
        System.out.println(nome2.hashCode());
        String nome3 = nome.concat(" Oliveira");
        System.out.println(nome);
        System.out.println(nome == nome2);
        System.out.println(nome3.hashCode());



    }
}
