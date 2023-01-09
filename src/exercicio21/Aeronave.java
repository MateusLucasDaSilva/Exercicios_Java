package exercicio21;

import java.util.Collection;

public class Aeronave {

    private int id;

    private String modelo;

    private Collection<Assento> assentos;

    private Collection<Voo> voos;

    public Aeronave() {
    }

    public Aeronave(int id, String modelo, Collection<Assento> assentos, Collection<Voo> voos) {
        this.id = id;
        this.modelo = modelo;
        this.assentos = assentos;
        this.voos = voos;
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

    public Collection<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(Collection<Assento> assentos) {
        this.assentos = assentos;
    }

    public Collection<Voo> getVoos() {
        return voos;
    }

    public void setVoos(Collection<Voo> voos) {
        this.voos = voos;
    }

}
