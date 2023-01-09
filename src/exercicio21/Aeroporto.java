package exercicio21;

import java.util.Collection;

public class Aeroporto {

    private int id;

    private String nome;

    private String cep;

    private Collection<Voo> voos;

    public Aeroporto() {
    }

    public Aeroporto(int id, String nome, String cep, Collection<Voo> voos) {
        this.id = id;
        this.nome = nome;
        this.cep = cep;
        this.voos = voos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Collection<Voo> getVoos() {
        return voos;
    }

    public void setVoos(Collection<Voo> voos) {
        this.voos = voos;
    }

}
