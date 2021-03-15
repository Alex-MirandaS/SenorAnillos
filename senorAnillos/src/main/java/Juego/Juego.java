/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Bestias.Bestia;
import Bestias.Orco;
import Bestias.Trasgo;
import Heroes.Elfo;
import Heroes.Heroe;
import Heroes.Hobbit;
import Heroes.Humano;
import Personaje.Personaje;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Juego {

    private final int LIM_TIPOS_BESTIAS = 2, LIM_TIPOS_HEROES = 3;

    Scanner sc = new Scanner(System.in);

    public void inicio() {
        System.out.println("Bienvenido al Juego oficial del Señor de los Anillos");
        System.out.println("Ingrese la cantidad de guerreros que desea para el ejercito de Heroes");
        int numHeroes = sc.nextInt();
        System.out.println("Ingrese la cantidad de guerreros que desea para el ejercito de Bestias");
        int numBestias = sc.nextInt();
        System.out.println("Inicio del juego XD");
        juego(numHeroes, numBestias);
    }

    private void juego(int numHeroes, int numBestias) {
        Personaje[] Heroes = new Heroe[numHeroes];
        Personaje[] Bestias = new Bestia[numBestias];

        llenarEjercitoBestias(Bestias);
        llenarEjercitoHeroes(Heroes);

        presentar(Heroes);
        presentar(Bestias);
    }

    private void llenarEjercitoBestias(Personaje[] bes) {
        int random;
        for (int i = 0; i < bes.length; i++) {
            random = (int) (Math.random() * LIM_TIPOS_BESTIAS + 1);

            if (random == 1) {
                bes[i] = new Orco("Orco" + (i + 1));
            } else {
                bes[i] = new Trasgo("Trasgo" + (i + 1));
            }
        }
    }

    private void llenarEjercitoHeroes(Personaje[] her) {
        int random;
        for (int i = 0; i < her.length; i++) {
            random = (int) (Math.random() * LIM_TIPOS_HEROES + 1);

            switch (random) {
                case 1:
                    her[i] = new Elfo("Elfo" + (i + 1));
                    break;
                case 2:
                    her[i] = new Hobbit("Hobbit" + (i + 1));
                    break;
                default:
                    her[i] = new Humano("Humano" + (i + 1));
            }
        }
    }

    private void presentar(Personaje[] per) {
        for (int i = 0; i < per.length; i++) {
per[i].presentarse();
        }
        System.out.println("--------------------------");
    }
}
