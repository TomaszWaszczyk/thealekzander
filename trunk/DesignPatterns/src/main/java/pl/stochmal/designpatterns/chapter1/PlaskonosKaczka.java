/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.stochmal.designpatterns.chapter1;

/**
 *
 * @author Agnieszka
 */
public class PlaskonosKaczka extends Kaczka {

    public PlaskonosKaczka() {
        kwakanieInterfejs = new Piszcz();
        latanieInterfejs = new NieLatam();
    }
    void wyswietl() {
        System.out.println("Wyswietl Plaskonos Kaczka");
    }

}
