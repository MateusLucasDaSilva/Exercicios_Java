package exercicio9;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        int anoNasc;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o ano do seu nascimento:");
        anoNasc = input.nextInt();
        int anos = calcularIdade(anoNasc);

        System.out.println("Voce possui " + anos + " anos de idade!");
    }

    public static int calcularIdade(int idade) {

        return (2021 - idade);
    }

}
