package Konzole;


public class Hra {

    private Konzole konzole;
    private DataHry dataHry;

    /**
     * prubeh hry
     */
    public Hra() {
        dataHry = DataHry.nacteniDatHry("res/text.json");
        konzole = new Konzole(dataHry);

    }

    /**
     * zapina vyber commandu
     */
    public void smycka() {
        konzole.execute();
    }
}



