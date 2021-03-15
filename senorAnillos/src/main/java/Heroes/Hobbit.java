/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heroes;

/**
 *
 * @author alex
 */
public class Hobbit extends Heroe{
    
    public Hobbit(String nombre) {
        super(nombre, 200, 90);
    }
    
        
    @Override
    public void presentarse(){
                ataque = obtenerAtaque();
        System.out.println("Hola, soy un Hobbit, y me llamo: "+this.nombre+"\n Ataque: "+obtenerAtaque());
    }
}
