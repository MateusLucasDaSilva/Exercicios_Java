package exercicioPiloto;

public class Sujeito {

    private String nome;

    private int id;

    private String genero;

    public Sujeito() {
    }

    public Sujeito(String nome, int id, String genero) {
        this.nome = nome;
        this.id = id;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
