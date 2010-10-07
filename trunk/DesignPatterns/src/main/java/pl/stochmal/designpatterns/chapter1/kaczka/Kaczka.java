/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.stochmal.designpatterns.chapter1.kaczka;

import pl.stochmal.designpatterns.chapter1.interfaces.KwakanieInterfejs;
import pl.stochmal.designpatterns.chapter1.interfaces.LatanieInterfejs;

/**
 *
 * @author Agnieszka
 */
public abstract class Kaczka {
    KwakanieInterfejs kwakanieInterfejs;
    LatanieInterfejs latanieInterfejs;

    public void wykoanjKwacz() {
        kwakanieInterfejs.kwacz();
    }

    public void plywaj() {
        System.out.println("Plywaj");
    }

    public void wykonajLatanie() {
        latanieInterfejs.lec();
    }

    public abstract void wyswietl();

    public void ustawLatanieInterfejs(LatanieInterfejs li) {
        latanieInterfejs = li;
    }

    public void ustawKwakanieInterfejs(KwakanieInterfejs ki) {
        kwakanieInterfejs = ki;
    }
}
