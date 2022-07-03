package basic.java.unit05.lesson28;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome , String cpf){
        this(nome); //chamando o primeiro construtor Pessoa com parametro nome
        this.cpf = cpf;
    }

    public void imprimir(){
        System.out.println("Nome : " + this.nome);
        System.out.println("CPF : "+ this.cpf);
        System.out.println("Rua : " + this.endereco.getRua());
        System.out.println("Numero : " + this.endereco.getNumero());
        System.out.println("CEP : " + this.endereco.getCep());
    }
    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
