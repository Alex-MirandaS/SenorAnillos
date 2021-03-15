/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje;

/**
 *
 * @author alex
 */
public class Personaje {

    protected String nombre;
    private int vida;
    private int ataque;
    
    public Personaje(String nombre, int vida, int ataque) {
       this.nombre = nombre; 
       this.vida = vida;
       this.ataque = ataque;
       
    }
    
    public void presentarse(){
        System.out.println("Hola soy un Personaje y me llamo: "+this.nombre);
    }
    
}
