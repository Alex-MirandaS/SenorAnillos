/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestias;

import Personaje.Personaje;

/**
 *
 * @author alex
 */
public class Orco extends Bestia {

    public Orco(String nombre) {
        super(nombre, 300, 75);
    }

    @Override
    public void presentarse() {
        ataque = obtenerAtaque();
        System.out.println("Hola, soy un Orco, y me llamo: " + this.nombre + "\n Ataque: " + ataque);
    }

    @Override
    public void atacar(Personaje defensor) {

        if (ataque > armaduraModificada(defensor.getArmadura())) {
            System.err.println("Ataque de Orco");
            defensor.restarVida(this.ataque);
        }
    }

    private int armaduraModificada(int armadura) {
        int restaArmadura = (int) (armadura * 0.1);
        return (armadura - restaArmadura);
    }
}
