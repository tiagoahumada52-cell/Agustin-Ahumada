/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author LABO B 7
 */
public class auto {
    String marca;
    String modelo;
    int velocidad;

    public auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad =0;
    }
    
    void velocidad(){
        System.out.println(velocidad+" "+"tu velocidad es esta");
}
    void acelerar(){
        velocidad += 30;
        System.out.println("casi de corta el cable del acelerador");
    }
    void desminuye(){
        velocidad -= 30;
        if (velocidad<0){
            velocidad =0;
        }
        System.out.println("se te elo el pupo"+" "+velocidad+"kh");
    }
}
