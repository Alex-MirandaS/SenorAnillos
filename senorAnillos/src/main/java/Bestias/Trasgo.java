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
public class Trasgo extends Bestia {

    public Trasgo(String nombre) {
        super(nombre, 325, 80);
    }

    @Override
    public void presentarse() {
        ataque = obtenerAtaque();
        System.out.println("Hola, soy un Trasgo, y me llamo: " + this.nombre + "\n Ataque: " + ataque);
    }

}
