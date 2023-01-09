package exercicioPiloto;

import java.util.Collection;
import java.util.Date;

public class Voo {

    private int id;

    private Date data;

    private String status;

    private Reserva reserva;

    private Aeroporto origem;

    private Piloto piloto;

    private Piloto copiloto;

    private Aeronave aeronave;

    private Aeroporto destino;

    private Collection<Aeroporto> escalas;

    public Voo() {
    }

    public Voo(int id, Date data, String status, Reserva reserva, Aeroporto origem, Piloto piloto, Piloto copiloto, Aeronave aeronave, Aeroporto destino, Collection<Aeroporto> escalas) {
        this.id = id;
        this.data = data;
        this.status = status;
        this.reserva = reserva;
        this.origem = origem;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.aeronave = aeronave;
        this.destino = destino;
        this.escalas = escalas;
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

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Piloto getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Piloto copiloto) {
        this.copiloto = copiloto;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    public Collection<Aeroporto> getEscalas() {
        return escalas;
    }

    public void setEscalas(Collection<Aeroporto> escalas) {
        this.escalas = escalas;
    }

}
