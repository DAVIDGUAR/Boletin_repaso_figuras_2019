/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujar_triangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Dibujar_triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int valor, numa = 0,z=0;

        valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura triangulo"));

        for (int i = 0; i < valor; i++) {
            int numb = 0;
            while (numb <= numa) {

                System.out.print("a");
                numb++;
            }
            System.out.println("");
            numa++;
        }
        
      
        
        
    }
}
