/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author User
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade = 30;
        String valor = Integer.toString(idade);
        
        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2);
        
        String valor3 = "30.5";
        float idade3 = Float.parseFloat(valor3);
        
        System.out.println(valor+","+idade2);
        System.out.printf("%.2f \n", idade3);
    }
    
}
