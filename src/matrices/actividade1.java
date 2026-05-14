/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author LABO B 7
 */
public class actividade1 {
    public static void main(String[] args) {
        String[][]arena=new String[3][3];
  

       
                
               
        arena[0][0] = "Gigante";
        arena[0][1] = "Mago Electrico";
        arena[0][2] = "Globo Bombastico";

   
        arena[1][0] = "Ejercito Esqueletos";
        arena[1][1] = "Valquiria";
        arena[1][2] = "Bebe Dragon";

      
        arena[2][0] = "Principe";
        arena[2][1] = "Descarga (Zap)";
        arena[2][2] = "Bruja";
        
        
         for (int i = 0; i <arena.length ; i++) {
             for (int j = 0; j <arena.length; j++) {
                 System.out.print("["+arena[i][j]+"]");
             }
             System.out.println();
        }
    }
}
