package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;
import Konzole.Konzole;

public class Akce extends Command {
    private Konzole konzole;
    public Akce(DataHry dataHry, Hrac hrac, Konzole konzole) {
        super(dataHry, hrac);
        this.konzole = konzole;
    }
//ted tadz udelam rozcestnik a budu
    @Override
    public String execute(String hodnota) {
        System.out.println("tak jako prvni se musis dostat do boruvci");
        do{
            konzole.execute();
        }
        while (!hrac.getMapId().equals(hrac.getCilovaLokace()));
        System.out.println("tak a ted jen napis Boruvci");
        konzole.akceVeTride();

        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
