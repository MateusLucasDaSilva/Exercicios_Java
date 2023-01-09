package exercicioPiloto;

import java.util.Date;

public class Reserva {

    private String status;

    private int id;

    private Date data;

    private Passageiro passageiro;

    private Voo voo;

    private Assento posicao;

    public Reserva() {
    }

    public Reserva(String status, int id, Date data, Passageiro passageiro, Voo voo, Assento posicao) {
        this.status = status;
        this.id = id;
        this.data = data;
        this.passageiro = passageiro;
        this.voo = voo;
        this.posicao = posicao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Assento getPosicao() {
        return posicao;
    }

    public void setPosicao(Assento posicao) {
        this.posicao = posicao;
    }

}
