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
public class mainAlumno {
    public static void main(String[] args) {
        
        double nota=Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota del alumno: "));
        
        String nombre=JOptionPane.showInputDialog("ingrese el nombre del alumno...");
        
        alumno primeralumno= new alumno(nota,nombre);
            
        primeralumno.info();
    }
}
