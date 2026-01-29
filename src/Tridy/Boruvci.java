package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Konzole.Konzole;
import Predmety.Predmet;

public class Boruvci extends CommandTrid{
    private Konzole konzole;

    public Boruvci(Lokace lokace, DataHry dataHry, Konzole konzole) {
        super(lokace, dataHry);
        this.konzole = konzole;
    }

    @Override
    public String akceVeTride(String hodnota, Hrac hrac) {
        Predmet orisek = dataHry.getItems().get(lokace.getNazevPredmetu());
        orisek.akce(hrac,dataHry, konzole);
        //ano
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
