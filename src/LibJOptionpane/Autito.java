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
public class Autito {
    String marca;
    String modelo;

    public Autito(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

  void arrancar(){
      JOptionPane.showMessageDialog(null,"arranco el auto");
  }
    
}
