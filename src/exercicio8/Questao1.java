package exercicio8;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        String frase;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma frase:");
        frase = input.nextLine();

        for (int contador = 0; contador < 10000; contador++) {
            System.out.println(frase);
        }

    }

}
