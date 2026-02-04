package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;
import Konzole.Konzole;
import Tridy.Boruvci;

public class Akce extends Command {
    private Konzole konzole;
    private Boruvci boruvci;
    public Akce(DataHry dataHry, Hrac hrac, Konzole konzole) {
        super(dataHry, hrac);
        this.konzole = konzole;
        this.boruvci = new Boruvci(dataHry.getLokace("Boruvci"),dataHry, konzole);
    }
    @Override
    public String execute(String hodnota) {
        System.out.println("tak jako prvni se musis dostat do boruvci");
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
