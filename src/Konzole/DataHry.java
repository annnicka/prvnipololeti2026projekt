package Konzole;

import Postavy.Postava;
import Predmety.Predmet;
import Tridy.Lokace;
import com.google.gson.Gson;

import javax.xml.crypto.Data;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * vypisovani z jsonu
 */
public class DataHry {
    private HashMap<String, Lokace> locations;
    private HashMap<String, Predmet>  predmety;
    private HashMap<String, Postava>  postavy;
    private Hrac hrac;

    /**
     * nacteni dat
     * @param cestaKSouboru
     * @return
     */
    public static DataHry nacteniDatHry(String cestaKSouboru) {
        try (Reader reader = new FileReader(cestaKSouboru)){
            Gson gson = new Gson();
            return gson.fromJson(
                    reader,
                    DataHry.class
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Hrac getHrac() {
        return hrac;
    }

    /**
     * overuje existenci lokace
     * @param mapId
     * @return
     */
    public boolean obsahujeMapu(String mapId) {
        return locations.containsKey(mapId);
    }

    /**
     * vyhleda a vrati objekt mistnosti podle nazvu
     * @param mapId
     * @return
     */
    public Lokace getLokace(String mapId) {
        return locations.get(mapId);
    }




    @Override
    public String toString() {
        return "DataHry{}";
    }
}
