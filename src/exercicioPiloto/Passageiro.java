package exercicioPiloto;

import java.util.Collection;
import java.util.Date;

public class Passageiro extends Sujeito {

    private Date aniversario;

    private Collection<Reserva> reservas;

    private Collection<Contato> contatos;

    public Passageiro() {
    }

    public Passageiro(Date aniversario, Collection<Reserva> reservas, Collection<Contato> contatos, String nome, int id, String genero) {
        super(nome, id, genero);
        this.aniversario = aniversario;
        this.reservas = reservas;
        this.contatos = contatos;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }

    public Collection<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Collection<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Collection<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(Collection<Contato> contatos) {
        this.contatos = contatos;
    }

}
