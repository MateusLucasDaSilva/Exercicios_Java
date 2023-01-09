package exercicio14;

import java.util.Date;

public class Emprestimo {

    private int id;
    private Date data;
    private Date dataDevolucao;
    private Livro livro;
    private Aluno aluno;
    private Funcionario funcionario;

    public Emprestimo() {
    }

    public Emprestimo(int id, Date data, Date dataDevolucao, Livro livro, Aluno aluno, Funcionario funcionario) {
        this.id = id;
        this.data = data;
        this.dataDevolucao = dataDevolucao;
        this.livro = livro;
        this.aluno = aluno;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
