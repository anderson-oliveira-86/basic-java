package basic.java.unit04.lesson19;

public class Estudante {
    private String name;
    private int idade;
    private String responsavel;
    private String telefone;
    private String endereco;
    private int serie;
    private String coordenador;
    private String[] materias;

    // Sobrecarga de construtor (contrutor com apenas os dados necessários para matricula do aluno na escola,
    //  as informações de serie, coordenador e matérias do ano letivo
    //  serão inseridas posteriormente pela coordenação da escola)
    public Estudante(String name, int idade, String responsavel, String telefone, String endereco) {
        this.name = name;
        this.idade = idade;
        this.responsavel = responsavel;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // Sobrecarga de método
    // neste método setIdade com a sobrecarga é possível inserir a idade tanto como int, quanto como String
    public void setIdade(String idade){
        this.idade = Integer.parseInt(idade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }
}
