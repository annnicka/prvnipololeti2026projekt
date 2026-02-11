package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;
import Konzole.Konzole;
import Tridy.Lokace;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

public class AkceTest {

    @org.junit.jupiter.api.Test
    public void testAkceFunguje() {
        DataHry data = new DataHry();
        Hrac hrac = new Hrac();
        data.setHrac(hrac);
        HashMap<String, String> vychody = new HashMap<>();
        Lokace boruvci = new Lokace("Boruvci", "Boruvci", "popis", vychody, null, null);
        HashMap<String, Lokace> seznamLokaci = new HashMap<>();
        seznamLokaci.put("Boruvci", boruvci);
        seznamLokaci.put("Domov", null); 
        seznamLokaci.put("Doupe", null);
        data.setLocations(seznamLokaci);
        Konzole konzole = new Konzole(data);
        Akce akce = new Akce(data, hrac, konzole);

        assertFalse(akce.exit());
    }
}
