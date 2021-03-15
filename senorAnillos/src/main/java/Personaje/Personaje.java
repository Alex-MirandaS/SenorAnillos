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
    protected int vida;
    protected int armadura;
    protected int ataque = obtenerAtaque();
    
    public Personaje(String nombre, int vida, int armadura) {
       this.nombre = nombre; 
       this.vida = vida;
       this.armadura = armadura;  
    }
    
    public void presentarse(){
        System.out.println("Hola soy un Personaje y me llamo: "+this.nombre+"\n Ataque: "+ataque);
        
    }
    
    public int obtenerAtaque(){
        return 0;
    }
    
    
}
