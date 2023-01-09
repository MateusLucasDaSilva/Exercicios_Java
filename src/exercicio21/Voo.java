package exercicio21;

import java.util.Collection;
import java.util.Date;

public class Voo {

    private int id;

    private String numero;

    private Date data;

    private String status;

    private Aeroporto destino;

    private Aeroporto origem;

    private Piloto piloto;

    private Piloto copiloto;

    private Collection<Reserva> reservas;

    private Collection<Aeroporto> escalas;

    private Aeronave aeronave;

    public Voo() {
    }

    public Voo(int id, String numero, Date data, String status, Aeroporto destino, Aeroporto origem, Piloto piloto, Piloto copiloto, Collection<Reserva> reservas, Collection<Aeroporto> escalas, Aeronave aeronave) {
        this.id = id;
        this.numero = numero;
        this.data = data;
        this.status = status;
        this.destino = destino;
        this.origem = origem;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.reservas = reservas;
        this.escalas = escalas;
        this.aeronave = aeronave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
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

    public Collection<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Collection<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Collection<Aeroporto> getEscalas() {
        return escalas;
    }

    public void setEscalas(Collection<Aeroporto> escalas) {
        this.escalas = escalas;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

}
