package exercicio20;

public class Endereco {

    private int id;

    private String cep;

    private String rua;

    private String numero;

    public Endereco() {
    }

    public Endereco(int id, String cep, String rua, String numero) {
        this.id = id;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
