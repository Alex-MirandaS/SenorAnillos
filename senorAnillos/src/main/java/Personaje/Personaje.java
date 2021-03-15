/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje;

/**
 *
 * @author alex
 */
public class Personaje {

    protected String nombre;
    protected int vida;
    protected int armadura;
    protected int ataque;

    public Personaje(String nombre, int vida, int armadura) {
        this.nombre = nombre;
        this.vida = vida;
        this.armadura = armadura;
    }

    public void presentarse() {
        ataque = obtenerAtaque();
        System.out.println("Hola soy un Personaje y me llamo: " + this.nombre + "\n Ataque: " + ataque);

    }

    public int obtenerAtaque() {
        return 0;
    }
    
    public void atacar(Personaje defensor){

        if (ataque > defensor.getArmadura()) {
           defensor.restarVida(this.ataque);
        }
    }

    public int getArmadura() {
        return armadura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }
    
    public void restarVida(int i){
        vida -= i;
    }

}
