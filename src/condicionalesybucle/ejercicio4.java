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
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int num1;
        int num2;
        int num3;
         System.out.println("ingrese un numero: ");
         num1=Sc.nextInt();
         System.out.println("ingrese otro numero: ");
         num2=Sc.nextInt();
         System.out.println("ingrese otro numero: ");
         num3=Sc.nextInt();
         if(num1>num2&num1>num3){
             System.out.println("el numero"+num1+"es mayor");
         }
         else if(num2>num1&num2>num3){
             System.out.println("el numero"+num2+"es mayor");
         }
         else if(num3>num1&num3>num2){
             System.out.println("el numero"+num3+"es mayor");
             
         }
    }
}
