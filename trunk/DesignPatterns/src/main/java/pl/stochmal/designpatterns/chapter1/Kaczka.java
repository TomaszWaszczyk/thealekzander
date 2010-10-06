/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.stochmal.designpatterns.chapter1;

/**
 *
 * @author Agnieszka
 */
public abstract class Kaczka {
    public void kwacz() {
        System.out.println("Kwacz!!!");
    }

    public void plywaj() {
        System.out.println("Plywaj");
    }

    abstract void wyswietl();
}
