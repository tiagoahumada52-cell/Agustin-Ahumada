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
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("ver perfil.(1)");
        System.out.println("editar perfil.(2)");
        System.out.println("cerrar secion.(3)");
        System.out.println("ingrese un numero para ingresar a la opcion");
        int num=Sc.nextInt();
        if (num==1){
            System.out.println("ver perfil");
            System.out.println("viendo perfil...");
        }
        else if (num==2){
            System.out.println("editar perfil");
                 System.out.println("editando perfil...");            
        }
        else if (num==3){
            System.out.println("cerrar sesion");
            System.out.println("cerrando sesion...");
            
        }
    }
}
