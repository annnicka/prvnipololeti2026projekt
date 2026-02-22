package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Predmety.Predmet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class USkaliTest {

    class TestovaciPredmet extends Predmet {
        public TestovaciPredmet(String jmeno) {
            super(jmeno);
        }
    }

    @Test
    void akceVeTride() {
        DataHry data = new DataHry();
        Hrac hrac = new Hrac();
        data.setHrac(hrac);

        hrac.setMapId("Skala");

        Predmet orisek = new TestovaciPredmet("Orisek");
        hrac.getB().pridatDoBatohu(orisek);

        Predmet pericko = new TestovaciPredmet("Pericko");
        HashMap<String, Predmet> items = new HashMap<>();
        items.put("Pericko", pericko);
        data.setItems(items);

        Skala uskali = new Skala(null, data, null);

        String vysledek = uskali.akceVeTride("", hrac);

        Assertions.assertEquals("", vysledek);
    }
}
