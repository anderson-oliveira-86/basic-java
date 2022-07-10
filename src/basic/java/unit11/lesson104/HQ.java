package basic.java.unit11.lesson104;

import java.util.Objects;

public class HQ implements Comparable<HQ> {
    private Long id;
    private String nome;
    private double valor;

    public HQ(Long id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
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

    @Override
    public String toString() {
        return "HQ{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HQ hq = (HQ) o;

        if (Double.compare(hq.valor, valor) != 0) return false;
        if (id != null ? !id.equals(hq.id) : hq.id != null) return false;
        return nome != null ? nome.equals(hq.nome) : hq.nome == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        temp = Double.doubleToLongBits(valor);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
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
