package basic.java.unit06.lesson36;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
