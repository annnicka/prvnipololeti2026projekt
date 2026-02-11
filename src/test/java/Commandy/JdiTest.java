package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;
import Tridy.Lokace;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class JdiTest {

    @Test
    public void testJdi() {
        // 1. PŘÍPRAVA DAT (jako by se načetla hra)
        DataHry dataHry = new DataHry();
        Hrac hrac = new Hrac();
        hrac.setMapId("domov"); // Hráč začíná doma

        // Vytvoříme lokace
        Lokace domov = new Lokace("domov", "domov", "popis", new HashMap<>(), null, null);
        Lokace les = new Lokace("les", "les", "popis", new HashMap<>(), null, null);

        // Propojíme je (z domova se dá jít do lesa)
        domov.getVychody().put("sever", "les");

        // DŮLEŽITÉ: Musíme lokace vložit do DataHry, aby je příkaz Jdi našel!
        HashMap<String, Lokace> mapaLokaci = new HashMap<>();
        mapaLokaci.put("domov", domov);
        mapaLokaci.put("les", les);
        dataHry.setLocations(mapaLokaci);

        // Vytvoříme příkaz Jdi
        Jdi jdi = new Jdi(dataHry, hrac);

        // 2. AKCE (hráč jde na sever)
        String vysledek = jdi.execute("sever");

        // 3. KONTROLA (očekáváme, že je v lese)
        Assertions.assertEquals("les", hrac.getMapId());
        Assertions.assertEquals("nachazis se v les", vysledek);
    }

    @Test
    public void testJdiDoZdi() {
        // 1. PŘÍPRAVA
        DataHry dataHry = new DataHry();
        Hrac hrac = new Hrac();
        hrac.setMapId("domov");

        Lokace domov = new Lokace("domov", "domov", "popis", new HashMap<>(), null, null);
        
        // DŮLEŽITÉ: Nastavit mapu lokací
        HashMap<String, Lokace> mapaLokaci = new HashMap<>();
        mapaLokaci.put("domov", domov);
        dataHry.setLocations(mapaLokaci);

        Jdi jdi = new Jdi(dataHry, hrac);

        // 2. AKCE (hráč zkouší jít na jih, kam nic nevede)
        String vysledek = jdi.execute("jih");

        // 3. KONTROLA (zůstal doma)
        Assertions.assertEquals("domov", hrac.getMapId());
        Assertions.assertEquals("nic tu neni", vysledek);
    }
}
