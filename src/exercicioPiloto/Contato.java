package exercicioPiloto;

public class Contato {

    private String operadora;

    private String num;

    private int id;

    private String ddd;

    private String ddi;

    private Passageiro passageiro;

    public Contato() {
    }

    public Contato(String operadora, String num, int id, String ddd, String ddi, Passageiro passageiro) {
        this.operadora = operadora;
        this.num = num;
        this.id = id;
        this.ddd = ddd;
        this.ddi = ddi;
        this.passageiro = passageiro;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

}
