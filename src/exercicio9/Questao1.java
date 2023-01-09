package exercicio9;
//psvm
//sout

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anoNasc;

        System.out.print("Digite o seu ano de nascimento:");
        anoNasc = input.nextInt();

        calcularIdade(2021 - anoNasc);
    }

    public static void calcularIdade(int idade) {
        System.out.println("Voce possui " + idade + " anos de idade!");

    }

}
