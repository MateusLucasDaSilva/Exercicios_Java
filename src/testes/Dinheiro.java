package testes;

public class Dinheiro extends Pgamento {

    private String notas;

    private Pgamento pgamento;

    public Dinheiro() {
    }

    public Dinheiro(String notas, Pgamento pgamento) {
        this.notas = notas;
        this.pgamento = pgamento;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Pgamento getPgamento() {
        return pgamento;
    }

    public void setPgamento(Pgamento pgamento) {
        this.pgamento = pgamento;
    }

}
