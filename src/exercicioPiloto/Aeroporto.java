package exercicioPiloto;

import java.util.Collection;

public class Aeroporto {

    private int id;

    private String local;

    private String nome;

    private Collection<Voo> voos;

    public Aeroporto() {
    }

    public Aeroporto(int id, String local, String nome, Collection<Voo> voos) {
        this.id = id;
        this.local = local;
        this.nome = nome;
        this.voos = voos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Voo> getVoos() {
        return voos;
    }

    public void setVoos(Collection<Voo> voos) {
        this.voos = voos;
    }

}
