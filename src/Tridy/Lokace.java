package Tridy;

import Predmety.Predmet;

import java.util.Map;

public class Lokace {

    private String id;
    private String name;
    private String description;
    private Map<String, String> vychody;
    private String predmet;
    private Map<String, Object> postavy;

    public Lokace(String id, String name, String description, Map<String, String> vychody, String predmet, Map<String, Object> postavy) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.vychody = vychody;
        this.predmet = predmet;
        this.postavy = postavy;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getVychody() {
        return vychody;
    }

    public String getPredmet() {
        return predmet;
    }

    @Override
    public String toString() {
        return "Lokace{popis:'" + description + "', vychody:" + vychody + "}";
    }
}
