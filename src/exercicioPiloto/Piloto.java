package exercicioPiloto;

import java.util.Collection;

public class Piloto extends Sujeito {

    private String numLicenca;

    private Collection<Voo> voo;

    public Piloto() {
    }

    public Piloto(String numLicenca, Collection<Voo> voo, String nome, int id, String genero) {
        super(nome, id, genero);
        this.numLicenca = numLicenca;
        this.voo = voo;
    }

    public String getNumLicenca() {
        return numLicenca;
    }

    public void setNumLicenca(String numLicenca) {
        this.numLicenca = numLicenca;
    }

    public Collection<Voo> getVoo() {
        return voo;
    }

    public void setVoo(Collection<Voo> voo) {
        this.voo = voo;
    }

}
