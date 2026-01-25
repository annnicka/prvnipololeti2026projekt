package Tridy;

import java.util.Map;

public class Lokace {
    /**
     * dodelat sem vlastnosti lokaci z jsonu
     */
    private String id;
    private String name;
    private String description;
    private Map<String, String> vychody;
    private Map<String, Object> predmety;
    private Map<String, Object> postavy;

    public Lokace() {
    }

    public Map<String, String> getVychody() {
        return vychody;
    }

    @Override
    public String toString() {
        return "Lokace{popis:'" + description + "', vychody:" + vychody + "}";
    }
}
