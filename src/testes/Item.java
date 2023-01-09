package testes;

public class Item {

    private int id;

    private double desc;

    private int quanti;

    private Pedido pedido;

    private Produto produto;

    public Item() {
    }

    public Item(int id, double desc, int quanti, Pedido pedido, Produto produto) {
        this.id = id;
        this.desc = desc;
        this.quanti = quanti;
        this.pedido = pedido;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDesc() {
        return desc;
    }

    public void setDesc(double desc) {
        this.desc = desc;
    }

    public int getQuanti() {
        return quanti;
    }

    public void setQuanti(int quanti) {
        this.quanti = quanti;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
