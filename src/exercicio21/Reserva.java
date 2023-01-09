package exercicio21;

import java.util.Date;

public class Reserva {

    private int id;

    private Date data;

    private String status;

    private Assento assento;

    private Voo voo;

    private Passageiro passageiro;

    public Reserva() {
    }

    public Reserva(int id, Date data, String status, Assento assento, Voo voo, Passageiro passageiro) {
        this.id = id;
        this.data = data;
        this.status = status;
        this.assento = assento;
        this.voo = voo;
        this.passageiro = passageiro;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

}
