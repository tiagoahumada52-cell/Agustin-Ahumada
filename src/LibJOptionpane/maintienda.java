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
public class maintienda {
    public static void main(String[] args) {
        String nombre=JOptionPane.showInputDialog("ingrese el nombre del usuario");
        double precioProducto=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor del producto"));
        
        tienda primerProducto=new tienda(precioProducto, nombre);
        primerProducto.info();
    }
    
}
