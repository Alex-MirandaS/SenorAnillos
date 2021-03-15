/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heroes;

import Bestias.Orco;
import Bestias.Trasgo;
import Personaje.Personaje;

/**
 *
 * @author alex
 */
public class Hobbit extends Heroe {

    private final int MIEDO_ESPECIAL = 5;

    public Hobbit(String nombre) {
        super(nombre, 200, 90);
    }

    @Override
    public void presentarse() {
        ataque = obtenerAtaque();
        System.out.println("Hola, soy un Hobbit, y me llamo: " + this.nombre + "\n Ataque: " + ataque);
    }

    @Override
    public void atacar(Personaje defensor) {

        if (defensor instanceof Trasgo) {
            System.out.println("Miedo extra");
            int temp = this.ataque - MIEDO_ESPECIAL;
            if (temp > defensor.getArmadura()) {
                defensor.restarVida(temp);
            }
        } else if (this.ataque > defensor.getArmadura()) {
            defensor.restarVida(this.ataque);
        }
    }
}
