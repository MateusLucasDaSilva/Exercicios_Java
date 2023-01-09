package Exercicio5;

import java.text.DecimalFormat;

public class Questao3 {

    public static void main(String[] args) {

        double valorDecimal = 10.123456789;
        
        DecimalFormat casas = new DecimalFormat("#.###");

        System.out.println(casas.format(valorDecimal));

    }

}
