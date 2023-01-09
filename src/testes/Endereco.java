package testes;

public class Endereco {

    private int id;

    private String rua;

    private String cep;

    public Endereco() {
    }

    public Endereco(int id, String rua, String cep) {
        this.id = id;
        this.rua = rua;
        this.cep = cep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
