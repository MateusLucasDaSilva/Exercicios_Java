
package exercicio8;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        String frase;
        int quant;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite uma frase:");
        frase = input.nextLine();
        
        System.out.print("Qunatas vezes voce deseja exibir a frase?:");
        quant = input.nextInt();
        
        for(int contador = 0; contador < quant; contador++){
        System.out.println(frase);
        
        }
    }
    
}
