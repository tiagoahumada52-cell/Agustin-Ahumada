/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author LABO B 7
 */
public class mainEleccion {
            public static void main(String[] args) {

       eleccion e1 = new eleccion("Tiago","rosado",17,1.80,1210.2308238183);
       eleccion e2= new eleccion("ahumada","purpura",18,1.40,893649632986.333);
       eleccion e3= new eleccion("ramiro","begro",12,1.40,83355632986.333);
       eleccion e4= new eleccion("robertino","naranja",16,1.40,89976542986.333);
       eleccion e5= new eleccion("alex","blanco",18,1.40,89364057438465496.333);
 e1.colorfv();
 e2.altura();
 e3.edad();
 e4.numTarjeta();
 e5.nombre();
}
}