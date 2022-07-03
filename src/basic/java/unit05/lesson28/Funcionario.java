package basic.java.unit05.lesson28;

public class Funcionario extends Pessoa{
    private double salario;

    static{
        System.out.println("JVM carregando a classe -> Dentro do bloco STATIC de inicialização da classe Funcionario");
    }
    {
        System.out.println("Executa antes de instanciar o objeto -> Dentro do bloco 1 de inicialização da classe Funcionario");
    }
    {
        System.out.println("Executa antes de instanciar o objeto -> Dentro do bloco 2 de inicialização da classe Funcionario");
    }
    public Funcionario(String nome , String cpf){
        super(nome , cpf); //utilizando o construtor da classe Pessoa(String nome, String cpf )
        System.out.println("Instanciando o Objeto -> Dentro do construtor Funcionario(String nome)");
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
