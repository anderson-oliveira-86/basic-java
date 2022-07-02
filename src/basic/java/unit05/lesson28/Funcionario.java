package basic.java.unit05.lesson28;

public class Funcionario extends Pessoa{
    private double salario;

    public double getSalario() {
        return salario;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Salario : " + this.salario);
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }
}
