/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionalesybucle;

import java.util.Scanner;

/**
 *
 * @author LABO B 7
 */
public class ejercicio1 {
    
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
       
        System.out.println("ingrese su edad para ingresar al sistema: ");
           int edad=Sc .nextInt();
         if (edad>=18){
             System.out.println("eres mayor de edad: ");
             
         }
         else {
             System.out.println("eres menor de edad: ");
         }
         
       
    }
        
          
}
