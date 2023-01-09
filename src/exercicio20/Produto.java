package exercicio20;

import java.util.Collection;

public class Produto {

    private int id;

    private String nome;

    private double preco;

    private Collection<Categoria> categorias;

    public Produto() {
    }

    public Produto(int id, String nome, double preco, Collection<Categoria> categorias) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categorias = categorias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Collection<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Collection<Categoria> categorias) {
        this.categorias = categorias;
    }

}
