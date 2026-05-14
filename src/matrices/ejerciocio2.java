/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author LABO B 7
 */
public class ejerciocio2 {
    public static void main(String[] args) {
         String[][]mundial=new String[9][2];
         
         mundial[0][0]="crlrcion";
         mundial[0][1]="pais";
         mundial[1][0]="Argentina";
         mundial[1][1]= "2";
         mundial[2][0]="Bresil";
         mundial[2][1]="1";
         mundial[3][0]="espana";
         mundial[3][1]="3";
         mundial[4][0]="mexico";
         mundial[4][1]="0";
         mundial[5][0]="francia";
         mundial[5][1]="4";
         mundial[6][0]="alemania";
         mundial[6][1]="2";
         mundial[7][0]="japon";
         mundial[7][1]="1";
         mundial[8][0]="portugal";
         mundial[8][1]="5";
         
             for (int i = 0; i <mundial.length ; i++) {
             for (int j = 0; j <mundial[i].length; j++) {
                 System.out.print("["+mundial[i][j]+"]");
             }
             System.out.println();
        }
    }
}