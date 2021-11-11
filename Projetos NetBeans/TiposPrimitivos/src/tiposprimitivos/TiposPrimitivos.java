/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nota1 = (float) 8.5; // ou float nota = 8.5f;
        String nome1 = "Diego";
        System.out.println("A sua nota é: " + nota1);
        System.out.printf("A nota de %s é: %.2f \n", nome1, nota1); //printf impreme formatado e %.2f mostra o tipo de formatação do flot e %s puxa a string. \n pula a linha
        System.out.format("A nota de %s é: %.1f \n", nome1, nota1);
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do novo aluno: ");
        String nome2 = teclado.nextLine();
        System.out.print("Digite a nota de " + nome2 + ": ");
        float nota2 = teclado.nextFloat();
        System.out.printf("A nota de %s é: %.2f \n", nome2, nota2);
    }
    
}
