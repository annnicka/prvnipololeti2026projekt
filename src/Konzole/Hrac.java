package Konzole;

public class Hrac {
    /**
     * misto kde se nachazi
     */
    private String mapId;
    private String cilovaLokace;
    private Batoh b;

    public Hrac(String mapId, Batoh b) {
        this.mapId = mapId;
        this.b = b;
    }

    public void setCilovaLokace(String cilovaLokace) {
        this.cilovaLokace = cilovaLokace;
    }

    public String getCilovaLokace() {
        return cilovaLokace;
    }

    public Batoh getB() {
        return b;
    }

    public void setB(Batoh b) {
        this.b = b;
    }

    public String getMapId() {
        return mapId;
    }

    public void setMapId(String mapId) {
        this.mapId = mapId;
    }
}
