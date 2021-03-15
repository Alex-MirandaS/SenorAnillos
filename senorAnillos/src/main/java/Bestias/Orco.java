/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestias;

/**
 *
 * @author alex
 */
public class Orco extends Bestia{
    
    public Orco(String nombre) {
        super(nombre, 300, 75);
    }
    
        
    @Override
    public void presentarse(){
        System.out.println("Hola, soy un Orco, y me llamo: "+this.nombre);
    }
}
