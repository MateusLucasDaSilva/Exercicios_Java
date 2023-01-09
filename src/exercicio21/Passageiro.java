package exercicio21;

import java.util.Collection;
import java.util.Date;

public class Passageiro extends Pessoa {

    private Date dataNasc;

    private Collection<Reserva> reservas;

    public Passageiro() {
    }

    public Passageiro(Date dataNasc, Collection<Reserva> reservas, int id, String nome, String cpf, String sexo, Collection<Telefone> telefones) {
        super(id, nome, cpf, sexo, telefones);
        this.dataNasc = dataNasc;
        this.reservas = reservas;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Collection<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Collection<Reserva> reservas) {
        this.reservas = reservas;
    }

}
