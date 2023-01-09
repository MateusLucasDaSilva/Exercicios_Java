package exercicio20;

public class CartaoCredito extends Pagamento {

    private String bandeira;

    private String agencia;

    private String operacao;

    private String numConta;

    private int numParcelas;

    public CartaoCredito() {
    }

    public CartaoCredito(String bandeira, String agencia, String operacao, String numConta, int numParcelas) {
        this.bandeira = bandeira;
        this.agencia = agencia;
        this.operacao = operacao;
        this.numConta = numConta;
        this.numParcelas = numParcelas;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }

}
