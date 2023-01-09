package exercicioPiloto;

import java.util.Collection;

public class Aeronave {

    private int id;

    private String modelo;

    private Collection<Voo> voos;

    private Collection<Assento> assentos;

    public Aeronave() {
    }

    public Aeronave(int id, String modelo, Collection<Voo> voos, Collection<Assento> assentos) {
        this.id = id;
        this.modelo = modelo;
        this.voos = voos;
        this.assentos = assentos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Collection<Voo> getVoos() {
        return voos;
    }

    public void setVoos(Collection<Voo> voos) {
        this.voos = voos;
    }

    public Collection<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(Collection<Assento> assentos) {
        this.assentos = assentos;
    }

}
