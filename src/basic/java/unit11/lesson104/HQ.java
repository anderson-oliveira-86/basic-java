package basic.java.unit11.lesson104;

import java.util.Objects;

public class HQ implements Comparable<HQ> {
    private Long id;
    private String nome;
    private double valor;
    private int quantidade;

    public HQ() {
    }

    public HQ(Long id, String nome, double valor) {
        this();
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public HQ(Long id, String nome, double valor, int quantidade) {
        this(id, nome, valor);
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "HQ{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HQ hq = (HQ) o;
        return Objects.equals(id, hq.id) && Objects.equals(nome, hq.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public int compareTo(HQ o) {
        return this.nome.compareTo(o.getNome());
    }

    //compareTo feito na mão (entendendo a lógica)
//    @Override
//    public int compareTo(HQ hq) {
//        //negativo se o this < hq
//        //se this == hq, return 0
//        //positivo se o this > hq
//        if(this.id < hq.getId()){
//            return -1;
//        }else if(this.id > hq.getId()){
//            return 1;
//        }else{
//            return 0;
//        }
//    }


}
