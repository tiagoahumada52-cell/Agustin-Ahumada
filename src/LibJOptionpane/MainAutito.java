/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibJOptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author LABO B 7
 */
public class MainAutito {
    public static void main(String[] args) {
        String marca=JOptionPane.showInputDialog("ingrese la marca del auto: ");
        String modelo=JOptionPane.showInputDialog("ingrese el modelo de el auto: ");
        
        Autito primerAuto= new Autito(marca, modelo);
        primerAuto.arrancar();
    }
        
}
