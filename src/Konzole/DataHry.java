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
    private static DataHry dataHry = nacteniDatHry("res/text.json");

    public static DataHry getSingleton() {
        return  dataHry;
    }

    private DataHry() {}

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


    public HashMap<String, Lokace> getLocations() {
        return locations;
    }

    public void setLocations(HashMap<String, Lokace> locations) {
        this.locations = locations;
    }

    public HashMap<String, Predmet> getPredmety() {
        return predmety;
    }

    public void setPredmety(HashMap<String, Predmet> predmety) {
        this.predmety = predmety;
    }

    public HashMap<String, Postava> getPostavy() {
        return postavy;
    }

    public void setPostavy(HashMap<String, Postava> postavy) {
        this.postavy = postavy;
    }

    public void setHrac(Hrac hrac) {
        this.hrac = hrac;
    }

    @Override
    public String toString() {
        return "DataHry{}";
    }
}
