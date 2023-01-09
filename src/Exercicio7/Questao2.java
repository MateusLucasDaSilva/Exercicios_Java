package Exercicio7;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Double clasat;

        Scanner input = new Scanner(System.in);

        System.out.print("Clasifique o nosso atendimento com a nota de 1 a 5 estelas!");
        clasat = input.nextDouble();

        if (clasat <= 1) {
            System.out.print("Voce classificou o nosso atendiemnto como pessimo!");
        } else if (clasat == 2) {
            System.out.print("Voce classificou o nosso atendiemnto como ruim!");
        } else if (clasat == 3) {
            System.out.print("Voce classificou o nosso atendiemnto como bom, obrigado!");
        } else if (clasat == 4) {
            System.out.print("Voce classificou o nosso atendiemnto como muito bom, obrigado!");
        } else if (clasat >= 5) {
            System.out.print("Voce classificou o nosso atendiemnto como otimo, obrigado!");
        }

    }
}
