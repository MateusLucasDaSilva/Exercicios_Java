package exercicio14;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String matricula, int id, String nome, String cpf, String rg) {
        super(id, nome, cpf, rg);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
