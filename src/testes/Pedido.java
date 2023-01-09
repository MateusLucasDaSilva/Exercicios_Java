package testes;

import java.util.Collection;
import java.util.Date;

public class Pedido {

    private int id;

    private Date data;

    private Pgamento pgamento;

    private Endereco entrega;

    private Cliente cliente;

    private Collection<Item> itens;

    public Pedido() {
    }

    public Pedido(int id, Date data, Pgamento pgamento, Endereco entrega, Cliente cliente, Collection<Item> itens) {
        this.id = id;
        this.data = data;
        this.pgamento = pgamento;
        this.entrega = entrega;
        this.cliente = cliente;
        this.itens = itens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Pgamento getPgamento() {
        return pgamento;
    }

    public void setPgamento(Pgamento pgamento) {
        this.pgamento = pgamento;
    }

    public Endereco getEntrega() {
        return entrega;
    }

    public void setEntrega(Endereco entrega) {
        this.entrega = entrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Collection<Item> getItens() {
        return itens;
    }

    public void setItens(Collection<Item> itens) {
        this.itens = itens;
    }

}
