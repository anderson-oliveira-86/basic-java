package basic.java.unit06.lesson32;

public enum TipoCliente {
    PESSOA_FISICA(1 , "Pessoa Física"),
    PESSOA_JURIDICA(2 , "Pessoa Juridica");

    private int value;
    private String relatorio;

    TipoCliente(int value, String relatorio) {
        this.value = value;
        this.relatorio = relatorio;
    }

    public static TipoCliente porNomeRelatorio(String nomeRelatorio  ){
        TipoCliente[] tipoClientes = values();
        for (TipoCliente tipoCliente :
                tipoClientes) {
            if (tipoCliente.getRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String toString() {
        return "TipoCliente{" +
                "value=" + value +
                ", relatorio='" + relatorio + '\'' +
                '}';
    }
}
