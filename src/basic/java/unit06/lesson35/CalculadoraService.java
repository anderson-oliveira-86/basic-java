package basic.java.unit06.lesson35;

public class CalculadoraService {

    public static void calcularImposto(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador : " + computador.getNome());
        System.out.println("Valor : " + computador.getValor());
        System.out.println("Imposto : " + imposto);
    }

    public static void calcularImposto(Tomate tomate){
        System.out.println("Relatório de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate : " + tomate.getNome());
        System.out.println("Valor : " + tomate.getValor());
        System.out.println("Imposto : " + imposto);
    }
}
