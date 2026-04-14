/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibJOptionpane;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
/**
 *
 * @author LABO B 7
 */
public class tienda {
   double precioProducto;
   String nombre;

    public tienda(double precioProducto, String nombre) {
        this.precioProducto = precioProducto;
        this.nombre = nombre;
    }
void info(){
    JOptionPane.showMessageDialog(null,"nombre de usuario"+" "+nombre); 
    if(precioProducto<=10000){
        JOptionPane.showMessageDialog(null,"el precio esta bien ");
    }else{
        JOptionPane.showMessageDialog(null,"el precio es caro");
    }
}
   
}
