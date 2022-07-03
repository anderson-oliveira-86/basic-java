package basic.java.unit06.lesson33;

public abstract class Employee extends Person {
    protected String name;
    protected double salario;

    public Employee(String name, double salario) {
        this.name = name;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();

}
