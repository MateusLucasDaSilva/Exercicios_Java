package Exercicio7;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Double quantProd;
        String nomeProd;

        Scanner input = new Scanner(System.in);

        System.out.print("Qual o nome do produto?");
        nomeProd = input.nextLine();

        System.out.print("Qual a quantidade do produto?");
        quantProd = input.nextDouble();

        if (quantProd <= 10) {
            System.out.print("O seu estoque de " + nomeProd + " esta baixo");
        } else if (quantProd > 10 && quantProd <= 20) {
            System.out.print("O seu estoque de " + nomeProd + " esta normal");
        }
        if (quantProd > 20) {
            System.out.print("O seu estoque de " + nomeProd + " esta exelente");
        }

    }

}
