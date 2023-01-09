package testes;

import java.util.Date;

public class Boleto extends Pgamento {

    private Date dateDesconto;

    private String codigoDeBarras;

    private int dataDoPagamento;

    public Boleto() {
    }

    public Boleto(Date dateDesconto, String codigoDeBarras, int dataDoPagamento) {
        this.dateDesconto = dateDesconto;
        this.codigoDeBarras = codigoDeBarras;
        this.dataDoPagamento = dataDoPagamento;
    }

    public Date getDateDesconto() {
        return dateDesconto;
    }

    public void setDateDesconto(Date dateDesconto) {
        this.dateDesconto = dateDesconto;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public int getDataDoPagamento() {
        return dataDoPagamento;
    }

    public void setDataDoPagamento(int dataDoPagamento) {
        this.dataDoPagamento = dataDoPagamento;
    }

}
