package basic.java.unit06.lesson33;

public class Developer extends Employee{
    public Developer(String name, double salario) {
        super(name, salario);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salario=" + salario +
                '}';
    }
}
