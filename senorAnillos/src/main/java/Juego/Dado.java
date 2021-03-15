/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author alex
 */
public class Dado {
    
    public static int dado(int lim){
    int random = (int) (Math.random() * lim + 1);
    return random;
}
}
