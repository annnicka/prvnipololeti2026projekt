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
        Hrac hrac = dataHry.getHrac();

    }

    /**
     * zapina vyber commandu
     */
    public void smycka() {

        Hrac h = new Hrac();
        HlavniHrabos h2 = new HlavniHrabos();
        h2.dialogNaZacatkuHry();
        konzole.execute();
    }
}



