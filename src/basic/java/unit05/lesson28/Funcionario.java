package basic.java.unit05.lesson28;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome){
        super(nome); //utilizando o construtor da classe Pessoa
    }

    public double getSalario() {
        return salario;
    }

    // testando a utilização do super, que auxilia na execução do método original da classe Pessoa
    // e acrescenta mais execuções (no caso abaixo o print da variável Salario)
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Salario : " + this.salario);
    }

    // testando a utilização dos atributos da classe Pessoa com modificador Protected
    public void imprimindo(){
        System.out.println();
        System.out.println("Nome : " + this.nome);
        System.out.println("CPF : "+ this.cpf);
        System.out.println("Rua : " + this.endereco.getRua());
        System.out.println("Numero : " + this.endereco.getNumero());
        System.out.println("CEP : " + this.endereco.getCep());
        System.out.println("Salario : " + this.salario);
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }
}
