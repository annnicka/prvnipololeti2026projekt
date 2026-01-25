package Tridy;

import java.util.Map;

public class Lokace {
    /**
     * nazev lokace
     */
    private String id;

    private String popis;
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
        return "Lokace{popis:'" + popis + "', vychody:" + vychody + "}";
    }
}
