package basic.java.unit06.lesson36;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um banco de dados");
    }
}
