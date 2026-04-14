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
public class edad {
    String nombre;
    double edad;

    public edad(String nombre, double edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    void info(){
           JOptionPane.showMessageDialog(null,nombre+" "+"asi te llamas gato ");
if(edad>=18){
    JOptionPane.showMessageDialog(null,"eres mayor de edad "+" "+nombre );
}else{
    JOptionPane.showMessageDialog(null,edad+" "+"sos menor de edad"+" "+nombre+" "+"gil");
}
    }
}
