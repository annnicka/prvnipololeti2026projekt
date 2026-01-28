package Tridy;

import Predmety.Predmet;

import java.util.Map;

public class Lokace {
    /**
     * dodelat sem vlastnosti lokaci z jsonu
     */
    private String id;
    private String name;
    private String description;
    private Map<String, String> vychody;
    private String predmet;
    private Map<String, Object> postavy;

    public Lokace() {
    }

    public Map<String, String> getVychody() {
        return vychody;
    }

    public String getNazevPredmetu() {
        return predmet;
    }

    @Override
    public String toString() {
        return "Lokace{popis:'" + description + "', vychody:" + vychody + "}";
    }
}
