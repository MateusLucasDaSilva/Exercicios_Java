package exercicio10;

import java.util.Scanner;

public class TesteMetodo {

    public static void main(String[] args) {
        int anoNasc, anoAtual;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o ano do seu nascimento:");
        anoNasc = input.nextInt();

        System.out.println("Digite o ano atual:");
        anoAtual = input.nextInt();

        int calq = MatematicaUtil.calcularIdade(anoNasc, anoAtual);
        System.out.println("Voce possui " + calq + " anos de idade!");

    }

}
