/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int anonasc = teclado.nextInt();
        int idade = 2021 - anonasc;
        System.out.println("Idade: " + idade);
        if (idade >= 18){
            System.out.println("MAIOR");
        } else {
            System.out.println("MENOR");
        }
    }
    
}
