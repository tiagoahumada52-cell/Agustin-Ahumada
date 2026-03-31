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
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int notas;
        System.out.println("ingrese las notas (0 al 10)");
        notas=Sc.nextInt();
        
        if(notas ==10.||notas>=9){
            System.out.println("la nota es Exelente ");
            
        }
        else if (notas==8.||notas>=7){
            System.out.println("estas aprobado ");
            
        }
        else if (notas==6.||notas>=4){
            System.out.println(" recupera ");
            
        }
        else if (notas==3.||notas>=0){
            System.out.println("estas desaprobado ");
        }
    }
}
