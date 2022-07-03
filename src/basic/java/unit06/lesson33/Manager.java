package basic.java.unit06.lesson33;

public class Manager extends Employee{

    public Manager(String name, double salario) {
        super(name, salario);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salario=" + salario +
                '}';
    }
}
