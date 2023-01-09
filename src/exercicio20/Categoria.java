package exercicio20;

import java.util.Collection;

public class Categoria {

    private int id;

    private String nome;

    private Collection<Produto> produtos;

    public Categoria() {
    }

    public Categoria(int id, String nome, Collection<Produto> produtos) {
        this.id = id;
        this.nome = nome;
        this.produtos = produtos;
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

    public Collection<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Collection<Produto> produtos) {
        this.produtos = produtos;
    }

}
