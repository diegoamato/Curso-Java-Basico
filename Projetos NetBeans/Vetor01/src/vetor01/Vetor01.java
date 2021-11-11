/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author User
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,5,7,4,8};
        System.out.println("O total de posições do vetor N é " +n.length);
        for (int c = 0; c<=4; c++){ // c<5 = c < n.lenght
            System.out.println("Na posição " + c + " o valor é " + n[c]);
        }
    }
    
}
