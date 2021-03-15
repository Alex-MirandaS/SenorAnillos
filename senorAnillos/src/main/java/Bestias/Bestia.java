/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestias;

import Juego.Dado;

/**
 *
 * @author alex
 */
public class Bestia extends Personaje.Personaje {

    private final int LIMITE_VALOR_ATAQUE = 90;

    public Bestia(String nombre, int vida, int ataque) {
        super(nombre, vida, ataque);
    }

    @Override
    public int obtenerAtaque() {
        return Dado.dado(LIMITE_VALOR_ATAQUE);
    }
}
