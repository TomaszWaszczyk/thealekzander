/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.stochmal.designpatterns.chapter1.kaczka;

import pl.stochmal.designpatterns.chapter1.kaczka.zachowania.Kwacz;
import pl.stochmal.designpatterns.chapter1.kaczka.zachowania.NieLatam;

/**
 *
 * @author Aleksander.Stochmal
 */
public class ModelKaczki extends Kaczka {

    public ModelKaczki() {
        kwakanieInterfejs = new Kwacz();
        latanieInterfejs = new NieLatam();
    }

    public void wyswietl() {
        System.out.println("Jestem modelem Kaczki!!");
    }

}
