package exercicio14;

import java.util.Date;

public class Cadastro {

    public static void main(String[] args) {
        Livro l = new Livro(101, "biblia Sagrada", "Profetas de Jesus", "Discipulos de jesus");

        Aluno a = new Aluno("201810070022", 102, "Mateus Lucas", "000.000.000-00", "00000000-00");

        Funcionario f = new Funcionario(1199.99, "atendente", 103, "Fernanda", "000.000.00-00", "00000000-00");

        Emprestimo emp = new Emprestimo(104, new Date(), new Date(), l, a, f);
        
        
        System.out.println("Livro:");
        System.out.println("Id:" + emp.getLivro().getId());
        System.out.println("Nome:" + emp.getLivro().getNome());
        System.out.println("Editora:" + emp.getLivro().getEditora());
        System.out.println("Autor:" + emp.getLivro().getAutor());
        System.out.println("---------------------------");
        
        System.out.println("Aluno:");
        System.out.println("Id:" + emp.getAluno().getId());
        System.out.println("Nome:" + emp.getAluno().getNome());
        System.out.println("CPF:" + emp.getAluno().getCpf());
        System.out.println("RG:" + emp.getAluno().getRg());
        System.out.println("Matricula:" + emp.getAluno().getMatricula());
        System.out.println("---------------------------");
        
        System.out.println("Funcionario:");
        System.out.println("Id:" + emp.getFuncionario().getId());
        System.out.println("Nome:" + emp.getFuncionario().getNome());
        System.out.println("CPF:" + emp.getFuncionario().getCpf());
        System.out.println("RG:" + emp.getFuncionario().getRg());
        System.out.println("Salario:" + emp.getFuncionario().getSalario());
        System.out.println("Funcao:" + emp.getFuncionario().getFuncao());
        System.out.println("---------------------------");

    }

}
