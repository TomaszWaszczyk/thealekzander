/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.stochmal.designpatterns.chapter1.kaczka;

import pl.stochmal.designpatterns.chapter1.kaczka.zachowania.Kwacz;
import pl.stochmal.designpatterns.chapter1.kaczka.zachowania.LatamBoMamSkrzydla;

/**
 *
 * @author Agnieszka
 */
public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        kwakanieInterfejs = new Kwacz();
        latanieInterfejs = new LatamBoMamSkrzydla();
    }
    public void wyswietl() {
        System.out.println("Wyswietl Dzika Kaczka");
    }
   
}
