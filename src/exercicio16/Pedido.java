package exercicio16;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private int id;
    private ArrayList<Produto> produtos;
    private double valorFrete;
    private double valorDesconto;
    private double valorCupom;
    private double valorTotal;
    private Date data;

    public Pedido() {
    }

    public Pedido(int id, ArrayList<Produto> produtos, double valorFrete, double valorDesconto, double valorCupom, double valorTotal, Date data) {
        this.id = id;
        this.produtos = produtos;
        this.valorFrete = valorFrete;
        this.valorDesconto = valorDesconto;
        this.valorCupom = valorCupom;
        this.valorTotal = valorTotal;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double getValorCupom() {
        return valorCupom;
    }

    public void setValorCupom(double valorCupom) {
        this.valorCupom = valorCupom;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
