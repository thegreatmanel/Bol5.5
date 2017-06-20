/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Boletin55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numeros numero=new Numeros();
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
        int n3=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
        numero.amosar(n1, n2, n3);
    }
    
}
