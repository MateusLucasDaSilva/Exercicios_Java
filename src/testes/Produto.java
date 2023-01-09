package testes;

public class Produto {

    private int id;

    private String categ;

    private double valor;

    private String nome;

    public Produto() {
    }

    public Produto(int id, String categ, double valor, String nome) {
        this.id = id;
        this.categ = categ;
        this.valor = valor;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCateg() {
        return categ;
    }

    public void setCateg(String categ) {
        this.categ = categ;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
