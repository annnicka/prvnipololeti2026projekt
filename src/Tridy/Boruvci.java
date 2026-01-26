package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Predmety.Predmet;

public class Boruvci extends CommandTrid{

    public Boruvci(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }

    @Override
    public String akceVeTride(String hodnota, Hrac hrac) {
        Predmet orisek = DataHry.getSingleton().getPredmety().get(lokace.getNazevPredmetu());
        orisek.akce(hrac);
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
