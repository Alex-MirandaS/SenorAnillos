/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heroes;

import Juego.Dado;

/**
 *
 * @author alex
 */
public class Heroe extends Personaje.Personaje {

    private final int LIMITE_VALOR_ATAQUE = 100;

    public Heroe(String nombre, int vida, int ataque) {
        super(nombre, vida, ataque);
    }

    @Override
    public int obtenerAtaque() {
        int dado1 = Dado.dado(LIMITE_VALOR_ATAQUE);
        int dado2 = Dado.dado(LIMITE_VALOR_ATAQUE);

        if (dado1 == dado2) {
            return dado1;
        } else if (dado1 > dado2) {
            return dado1;
        } else {
            return dado2;
        }
    }
}
