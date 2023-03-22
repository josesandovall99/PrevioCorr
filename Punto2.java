/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.taller1p2;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int D, M, A, bisiesto;

        D = Integer.parseInt(JOptionPane.showInputDialog("DIGITE DIA:"));
        M = Integer.parseInt(JOptionPane.showInputDialog("DIGITE MES"));
        A = Integer.parseInt(JOptionPane.showInputDialog("DIGITE AÑO"));
        
        bisiesto = A % 4;
        String fecha = "LA FECHA ES: " + D + " / " + M + " / " + A;
        String mensajeError = "LA FECHA: " + D + " / " + M + " / " + A + "" + "\nNO VALIDA.";

        System.out.println(bisiesto);

        if (M <= 12 && M != 0 && M != 2 && M != 4 && M != 6 && M != 9 && M != 11 && D >= 1 && D <= 32 && A > 0) {

            JOptionPane.showMessageDialog(null, fecha + " FECHA VALIDA");

        } 
        if (M <= 12 && M != 0 && M != 1 && M != 2 && M != 3 && M != 5 && M != 7 && M != 8 && M != 10 && M != 12 && D >= 1 && D <= 30 && A > 0) {

            JOptionPane.showMessageDialog(null, fecha + " FECHA VALIDA");

        } 
        if (M <= 12 && M != 0 && M == 2 && bisiesto == 0 && D >= 1 && D <= 29 && A > 0) {

            JOptionPane.showMessageDialog(null, fecha + " FECHA VALIDA");

        }
        if (M <= 12 && M != 0 && M == 2 && bisiesto != 0 && D >= 1 && D <= 28 && A > 0) {

            JOptionPane.showMessageDialog(null, fecha + " FECHA VALIDA");

        } else {

            JOptionPane.showMessageDialog(null, mensajeError, "Erroneo", JOptionPane.ERROR_MESSAGE);
        }

    }
    
}
