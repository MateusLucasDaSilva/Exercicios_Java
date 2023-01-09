package testes;

import java.util.Date;

public class Pgamento {

    private Date data;

    private double valor;

    private int id;

    private String sit;

    private Cartao cartao;

    private Dinheiro dinheiro;

    private Boleto boleto;

    private Pedido pedido;

    public Pgamento() {
    }

    public Pgamento(Date data, double valor, int id, String sit, Cartao cartao, Dinheiro dinheiro, Boleto boleto, Pedido pedido) {
        this.data = data;
        this.valor = valor;
        this.id = id;
        this.sit = sit;
        this.cartao = cartao;
        this.dinheiro = dinheiro;
        this.boleto = boleto;
        this.pedido = pedido;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSit() {
        return sit;
    }

    public void setSit(String sit) {
        this.sit = sit;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public Dinheiro getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Dinheiro dinheiro) {
        this.dinheiro = dinheiro;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

}
