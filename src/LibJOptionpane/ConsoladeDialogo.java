/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibJOptionpane;
import javax.swing.JOptionPane;
 
public class ConsoladeDialogo {
    public static void main(String[] args) {
        int edad;
        String nombre=  JOptionPane.showInputDialog("ingrese el nombre");
      JOptionPane.showMessageDialog(null,"manisero"+" "+nombre);
        
      edad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos anios tiene: "));
      JOptionPane.showMessageDialog(null,"Tengo: "+edad + " anios");
    
    }
}
