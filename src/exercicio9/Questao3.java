package exercicio9;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        String frase;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma Frase: ");
        frase = input.nextLine();

        imprimirFrases(frase);

    }

    public static void imprimirFrases(String frases) {
        for (int contador = 0; contador < 10000; contador++) {
            System.out.println(frases);
        }
    }

}
