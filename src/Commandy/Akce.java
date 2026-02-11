package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;
import Konzole.Konzole;
import Tridy.Boruvci;

public class Akce extends Command {
    private Konzole konzole;
    private Boruvci boruvci;

    /**
     * vytvori mi boruvci
     * @param dataHry
     * @param hrac
     * @param konzole
     */
    public Akce(DataHry dataHry, Hrac hrac, Konzole konzole) {
        super(dataHry, hrac);
        this.konzole = konzole;
        this.boruvci = new Boruvci(dataHry.getLokace("Boruvci"),dataHry, konzole);
    }

    /**
     * hrace nejdrive prenese ke konzoli aby se dostal na lokaci a pote posle na lokaci
     * @param hodnota
     * @return
     */
    @Override
    public String execute(String hodnota) {
        System.out.println("tak jako prvni se musis dostat do boruvci a napis boruvci");
        do{
            konzole.execute();
        }
        while (!hrac.getMapId().equals(hrac.getCilovaLokace()));
        System.out.println("tak a ted jen napis Boruvci");


        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
