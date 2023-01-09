
package exercicio13;

public class Produtos {
     private int id;
    private String nome;
    private String descricao;
    private String codBarras;
    private double valor;

    public Produtos() {
    }

    public Produtos(int id, String nome, String descricao, String codBarras, double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.codBarras = codBarras;
        this.valor = valor;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
