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
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
        int numero;
        System.out.println("ingrese un numero: ");
        numero =Sc.nextInt();
        
        if(numero>0){
            System.out.println("el numero es positivo: ");
        } else if (numero==0){
            System.out.println("el numero es neutro: ");
        }
        else{
            System.out.println("el numero es negativo: ");
        }
    }
}
