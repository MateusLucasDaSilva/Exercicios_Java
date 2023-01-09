package exercicio21;

import java.util.Collection;

public class Piloto extends Pessoa {

    private String numLicenca;

    private Collection<Voo> voos;

    public Piloto() {
    }

    public Piloto(String numLicenca, Collection<Voo> voos, int id, String nome, String cpf, String sexo, Collection<Telefone> telefones) {
        super(id, nome, cpf, sexo, telefones);
        this.numLicenca = numLicenca;
        this.voos = voos;
    }

    public String getNumLicenca() {
        return numLicenca;
    }

    public void setNumLicenca(String numLicenca) {
        this.numLicenca = numLicenca;
    }

    public Collection<Voo> getVoos() {
        return voos;
    }

    public void setVoos(Collection<Voo> voos) {
        this.voos = voos;
    }

}
