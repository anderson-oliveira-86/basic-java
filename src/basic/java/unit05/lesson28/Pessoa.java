package basic.java.unit05.lesson28;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Pessoa() {
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
