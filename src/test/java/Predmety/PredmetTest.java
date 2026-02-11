package Predmety;

import Konzole.DataHry;
import Konzole.Hrac;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import java.util.HashMap;

public class PredmetTest {

    @Test
    public void testAkcePredmetu() {
        DataHry data = new DataHry();
        Hrac hrac = new Hrac();
        data.setHrac(hrac);
        Predmet predmet = new Predmet("Predmet");
        predmet.name = "Predmet";
        predmet.location = "lokace";
        predmet.locationtogoto = "lokace2";
        predmet.textPoNalezeni = "text";
        HashMap<String, Predmet> items = new HashMap<>();
        items.put("Predmet", predmet);
        data.setItems(items);
        predmet.akce(hrac, data, null);

        Assertions.assertEquals("sklep", hrac.getCilovaLokace());
        Assertions.assertTrue(hrac.getB().jeVBatohu("Klic"));
    }
}
