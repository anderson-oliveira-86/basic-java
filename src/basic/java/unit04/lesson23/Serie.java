package basic.java.unit04.lesson23;

public class Serie {
    private String titulo;
    private static int[] episodios;

    //Ordem de execução
    // 1 - Bloco de inialização estática é executado quando a JVM carrega a Classe
    // 2 - Alocado espaço em memória do objeto
    // 3 - Cada atributo da classe é criado e inicializado com valores default ou valor passado direto no atributo.
    // 4 - bloco de inicialização é executado
    // 5 - construtor cria uma instancia

    //Bloco de inicialização
    {
        System.out.println("bloco de inicialização - executado quando a classe é instanciada");
    }

    //Bloco de inicialização estático
    static {
        System.out.println("bloco estático sendo inicializado - executado 1x no momento que a Classe é carregada");
    }

    public Serie(String titulo) {
        System.out.println("contrutor sendo executado");
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static int[] getEpisodios() {
        return episodios;
    }

    public static void setEpisodios(int[] episodios) {
        Serie.episodios = episodios;
    }
}
