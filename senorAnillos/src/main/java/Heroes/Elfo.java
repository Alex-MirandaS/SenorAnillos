/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heroes;

import Bestias.Orco;
import Personaje.Personaje;

/**
 *
 * @author alex
 */
public class Elfo extends Heroe{
    
    private final int RABIA_EXTRA=10;
    
    public Elfo(String nombre) {
        super(nombre, 250, 80);
    }
    
    @Override
    public void presentarse(){
                ataque = obtenerAtaque();
        System.out.println("Hola, soy un Elfo, y me llamo: "+this.nombre+"\n Ataque: "+obtenerAtaque());
    }
    
    @Override
        public void atacar(Personaje defensor){

            if (defensor instanceof Orco) {
            int temp= this.ataque+RABIA_EXTRA;
            defensor.restarVida(temp);
        }
        if (ataque > defensor.getArmadura()) {
           defensor.restarVida(this.ataque);
        }
    }
    
}
