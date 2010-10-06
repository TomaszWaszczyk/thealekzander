/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.stochmal.designpatterns.chapter1;

/**
 *
 * @author Agnieszka
 */
public class Start {
    public static void main(String[] args) {
        PlaskonosKaczka pk = new PlaskonosKaczka();
        pk.wyswietl();
        pk.plywaj();

        DzikaKaczka dk = new DzikaKaczka();
        dk.wyswietl();
        dk.kwacz();
    }
}
