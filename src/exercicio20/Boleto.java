package exercicio20;

import java.util.Date;

public class Boleto extends Pagamento {

    private String codBarras;

    private Date dataVencimento;

    public Boleto() {
    }

    public Boleto(String codBarras, Date dataVencimento, int id, Date data, double valor, String situacao, Dinheiro dinheiro, Boleto boleto, CartaoCredito cartaoCredito, Pedido pedido) {
        super(id, data, valor, situacao, dinheiro, boleto, cartaoCredito, pedido);
        this.codBarras = codBarras;
        this.dataVencimento = dataVencimento;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    
   
}
