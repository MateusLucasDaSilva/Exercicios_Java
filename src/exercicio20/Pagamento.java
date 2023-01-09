package exercicio20;
import java.util.Date;

public class Pagamento {

	private int id;

	private Date data;

	private double valor;

	private String situacao;

	private Dinheiro dinheiro;
        
        private Boleto boleto;
        
        private CartaoCredito cartaoCredito;

	private Pedido pedido;

    public Pagamento() {
    }

    public Pagamento(int id, Date data, double valor, String situacao, Dinheiro dinheiro, Boleto boleto, CartaoCredito cartaoCredito, Pedido pedido) {
        this.id = id;
        this.data = data;
        this.valor = valor;
        this.situacao = situacao;
        this.dinheiro = dinheiro;
        this.boleto = boleto;
        this.cartaoCredito = cartaoCredito;
        this.pedido = pedido;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

}
