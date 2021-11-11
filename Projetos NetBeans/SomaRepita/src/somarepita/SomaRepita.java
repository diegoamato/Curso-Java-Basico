/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somarepita;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class SomaRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0, p=-1, i=0, t=-1, m;

        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número:<br><em>(valor 0 interrompe)</em></html>"));
            s += n;
            t++;
            if (n%2 == 0){
                p++;
            } else {
                i++;
            }
        } while (n != 0);
        m = s/t;
        JOptionPane.showMessageDialog(null, "<html> ..:: Resultado final ::.. <br>"
                + "<br>Somatório vale: " + s
                + "<br>Total números pares: " + p
                + "<br>Total de Ímpares: " + i
                + "<br>Média dos valores: " + m);
    }
}
