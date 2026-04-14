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
public class mainEdad {
    public static void main(String[] args) {
        double edad =Double.parseDouble(JOptionPane.showInputDialog("ingrese la edad de la persona: "));
        String nombre= JOptionPane.showInputDialog("ingrese el nombre de la persona");
        
        edad primeraEdad=new edad(nombre, edad);
        primeraEdad.info();
    }
}
