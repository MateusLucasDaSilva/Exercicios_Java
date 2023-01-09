package exercicio20;

import java.util.Collection;
import java.util.Date;

public class Pedido {

    private int id;

    private Date data;

    private Pagamento pagamento;

    private Collection<Item> itens;

    private Endereco localEntrega;

    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(int id, Date data, Pagamento pagamento, Collection<Item> itens, Endereco localEntrega, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.pagamento = pagamento;
        this.itens = itens;
        this.localEntrega = localEntrega;
        this.cliente = cliente;
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

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Collection<Item> getItens() {
        return itens;
    }

    public void setItens(Collection<Item> itens) {
        this.itens = itens;
    }

    public Endereco getLocalEntrega() {
        return localEntrega;
    }

    public void setLocalEntrega(Endereco localEntrega) {
        this.localEntrega = localEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
