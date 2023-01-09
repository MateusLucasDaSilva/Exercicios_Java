
package exercicio17;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
   

    private int id;
    private ArrayList<Item> itens;
    private double valorFrete;
    private double valorDesconto;
    private double valorCupom;
    private double valorTotal;
    private Date data;

    public Pedido() {
    }

    public Pedido(int id, ArrayList<Item> itens, double valorFrete, double valorDesconto, double valorCupom, double valorTotal, Date data) {
        this.id = id;
        this.itens = itens;
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

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
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
