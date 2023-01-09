package exercicio20;

public class Item {

    private int id;

    private int qunatidade;

    private double subTotal;

    private double desconto;

    private Produto produto;

    private Pedido pedido;

    public Item() {
    }

    public Item(int id, int qunatidade, double subTotal, double desconto, Produto produto, Pedido pedido) {
        this.id = id;
        this.qunatidade = qunatidade;
        this.subTotal = subTotal;
        this.desconto = desconto;
        this.produto = produto;
        this.pedido = pedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQunatidade() {
        return qunatidade;
    }

    public void setQunatidade(int qunatidade) {
        this.qunatidade = qunatidade;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

}
