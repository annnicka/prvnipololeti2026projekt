package Konzole;


import Postavy.HlavniHrabos;

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
        HlavniHrabos h = new HlavniHrabos();
        h.dialogNaZacatkuHry();
        konzole.execute();
    }
}



