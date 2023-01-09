package exercicio21;

public class Telefone {

    private int id;

    private String codPais;

    private String ddd;

    private String numero;

    private String operadora;

    public Telefone() {
    }

    public Telefone(int id, String codPais, String ddd, String numero, String operadora) {
        this.id = id;
        this.codPais = codPais;
        this.ddd = ddd;
        this.numero = numero;
        this.operadora = operadora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

}
