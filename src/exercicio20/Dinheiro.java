package exercicio20;

public class Dinheiro extends Pagamento {

    private String tipoCedula;

    private Pagamento pagamento;

    public Dinheiro() {
    }

    public Dinheiro(String tipoCedula, Pagamento pagamento) {
        this.tipoCedula = tipoCedula;
        this.pagamento = pagamento;
    }

    public String getTipoCedula() {
        return tipoCedula;
    }

    public void setTipoCedula(String tipoCedula) {
        this.tipoCedula = tipoCedula;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

}
