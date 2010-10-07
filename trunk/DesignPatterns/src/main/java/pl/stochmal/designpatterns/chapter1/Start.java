/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.stochmal.designpatterns.chapter1;

import pl.stochmal.designpatterns.chapter1.kaczka.PlaskonosKaczka;
import pl.stochmal.designpatterns.chapter1.kaczka.DzikaKaczka;
import pl.stochmal.designpatterns.chapter1.kaczka.Kaczka;
import pl.stochmal.designpatterns.chapter1.kaczka.ModelKaczki;
import pl.stochmal.designpatterns.chapter1.kaczka.zachowania.LotZNapedemRakietowym;

/**
 *
 * @author Agnieszka
 */
public class Start {
    public static void main(String[] args) {
        Kaczka pk = new PlaskonosKaczka();
        pk.wyswietl();
        pk.plywaj();
        pk.wykonajLatanie();

        Kaczka dk = new DzikaKaczka();        
        dk.wykoanjKwacz();
        dk.wykonajLatanie();

        Kaczka model  = new ModelKaczki();
        model.wykonajLatanie();
        model.ustawLatanieInterfejs(new LotZNapedemRakietowym());
        model.wykonajLatanie();
        model.wyswietl();

    }
}
