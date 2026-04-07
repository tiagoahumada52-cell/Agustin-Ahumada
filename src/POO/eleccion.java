/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author LABO B 7
 */
public class eleccion {
     // Atributos
    String nombre;
   String colorfv;
    int edad;
    double altura;
    double numTarjeta;
            

    // Constructor
     public eleccion(String nombre, String colorfv, int edad, double altura, double numTarjeta) {  
        this.nombre = nombre;
        this.colorfv = colorfv;
        this.edad = edad;
        this.altura = altura;
        this.numTarjeta = numTarjeta;
    }

    // Métodos
     void colorfxv() {
         System.out.println(colorfv + "que nvuen color");
    }

     void altura() {
        System.out.println(altura + "tu altura es buenisimaaaaaaaaaa");
    }
     void edad() {
        System.out.println(edad + "gracias");
    }
     void numTarjeta() {
        System.out.println(numTarjeta + "gracias");
    }
     void nombre() {
        System.out.println(nombre+ "gracias");
    }

}
