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
public class alumno {
    double nota;
    String nombre;

    public alumno(double nota, String nombre) {
        this.nota = nota;
        this.nombre = nombre;
    }
    
 void info(){
     if(nota>6){
         JOptionPane.showMessageDialog(null,nota+" "+"aprobado");
     }else{
         JOptionPane.showMessageDialog(null,nota+" "+"desaprobado");
     }
    JOptionPane.showMessageDialog(null,"esas es la inofrmacion del aulumno ");
 
 }   
}
