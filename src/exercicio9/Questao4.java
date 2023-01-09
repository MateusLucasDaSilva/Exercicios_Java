package exercicio9;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        double altura, peso;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a sua altura:");
        altura = input.nextDouble();

        System.out.print("Digite o seu peso:");
        peso = input.nextDouble();

        calcularImc(altura, peso);
    }

    public static void calcularImc(double altura, double peso) {
        double imc;

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Voce esta abaixo do peso ideal!");

        } else if (imc > 35) {
            System.out.println("Voce esta acima do peso ideal!");
        }
        if (imc >= 18.5 && imc < 35) {
            System.out.println("Voce esta com o peso ideal");
        }
    }

}
