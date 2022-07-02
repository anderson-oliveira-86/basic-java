package basic.java.unit04.lesson20;

public class Aluno {

    private String nomeAluno;
    private String serie;
    private String[] materias;

    // Bloco de inicialização
    // - Criado toda ver que é gerado uma nova instanciancia
    // - Criado antes do construtor
    {
        materias = new String[8];
        materias[0] = "Lingua Portuguesa";
        materias[1] = "Matemática";
        materias[2] = "Geografia";
        materias[3] = "História";

    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }
}
