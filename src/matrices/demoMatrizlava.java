/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author LABO B 7
 */
public class demoMatrizlava {
    public static void main(String[] args) {
         String[][]arena=new String[5][5];
         arena[1][3]="barbaro";
         arena[3][4]="barbaro";
         arena[2][2]="barbaro";
   
         for (int i = 0; i <arena.length ; i++) {
             for (int j = 0; j <arena.length; j++) {
                 System.out.print("["+arena[i][j]+"]");
             }
             System.out.println();
        }
    }
   
}
