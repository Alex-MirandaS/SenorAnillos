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
public class Humano extends Heroe {

    public Humano(String nombre) {
        super(nombre, 180, 70);
    }

    @Override
    public void presentarse() {
        ataque = obtenerAtaque();
        System.out.println("Hola, soy un Humano, y me llamo: " + this.nombre + "\n Ataque: " + ataque);
    }
}
