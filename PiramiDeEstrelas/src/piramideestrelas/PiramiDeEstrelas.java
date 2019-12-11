/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramideestrelas;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class PiramiDeEstrelas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        int valor;
        
        
        
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura piramide"));
        
        
        for (int altura=1; altura<= valor ; altura++) {
           
            for  (int espacio = 1; espacio <= valor-altura; espacio++) {
                    
                    System.out.print(" ");
                }
            
            
            for  (int asterisco = 1; asterisco <= (altura*2)-1; asterisco++) {
                   System.out.print("*");
                    
                }
            
            System.out.println();
            
            
            
            
        }
        
        
        
        
    }
    
}
