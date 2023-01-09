package exercicioPiloto;

import java.util.Collection;

public class Assento {

    private String status;

    private int fileira;

    private String local;

    private int id;

    private Collection<Reserva> reservas;

    private Aeronave aeronave;

    public Assento() {
    }

    public Assento(String status, int fileira, String local, int id, Collection<Reserva> reservas, Aeronave aeronave) {
        this.status = status;
        this.fileira = fileira;
        this.local = local;
        this.id = id;
        this.reservas = reservas;
        this.aeronave = aeronave;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFileira() {
        return fileira;
    }

    public void setFileira(int fileira) {
        this.fileira = fileira;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Collection<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Collection<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

}
