/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.stochmal.designpatterns.chapter1;

import pl.stochmal.designpatterns.chapter1.interfaces.KwakanieInterfejs;

/**
 *
 * @author Agnieszka
 */
public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        kwakanieInterfejs = new Kwacz();
        latanieInterfejs = new LatamBoMamSkrzydla();
    }
    void wyswietl() {
        System.out.println("Wyswietl Dzika Kaczka");
    }
   
}
