package testes;

public class Cartao extends Pgamento {

    private String Parcelas;

    private String Banco;

    private String NumeroDaConta;

    public Cartao() {
    }

    public Cartao(String Parcelas, String Banco, String NumeroDaConta) {
        this.Parcelas = Parcelas;
        this.Banco = Banco;
        this.NumeroDaConta = NumeroDaConta;
    }

    public String getParcelas() {
        return Parcelas;
    }

    public void setParcelas(String Parcelas) {
        this.Parcelas = Parcelas;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public String getNumeroDaConta() {
        return NumeroDaConta;
    }

    public void setNumeroDaConta(String NumeroDaConta) {
        this.NumeroDaConta = NumeroDaConta;
    }

}
