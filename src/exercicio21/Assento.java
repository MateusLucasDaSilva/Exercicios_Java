package exercicio21;

import java.util.Collection;

public class Assento {

    private int id;

    private String status;

    private int numFileira;

    private String posFileira;

    private Aeronave aeronave;

    private Collection<Reserva> reservas;

    public Assento() {
    }

    public Assento(int id, String status, int numFileira, String posFileira, Aeronave aeronave, Collection<Reserva> reservas) {
        this.id = id;
        this.status = status;
        this.numFileira = numFileira;
        this.posFileira = posFileira;
        this.aeronave = aeronave;
        this.reservas = reservas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumFileira() {
        return numFileira;
    }

    public void setNumFileira(int numFileira) {
        this.numFileira = numFileira;
    }

    public String getPosFileira() {
        return posFileira;
    }

    public void setPosFileira(String posFileira) {
        this.posFileira = posFileira;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public Collection<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Collection<Reserva> reservas) {
        this.reservas = reservas;
    }

}
