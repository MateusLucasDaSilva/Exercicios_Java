
package exercicio17;

public class Item {
 private int id;
 private int quantidade;
 private double subTotal;
 private Produto produto;
 private Pedido pedido;

    public Item() {
    }

    public Item(int id, int quantidade, int subTotal, Produto produto, Pedido pedido) {
        this.id = id;
        this.quantidade = quantidade;
        this.subTotal = subTotal;
        this.produto = produto;
        this.pedido = pedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getSubTotal() {
        return (int) subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
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