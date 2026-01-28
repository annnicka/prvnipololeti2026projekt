package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Predmety.Predmet;

public class Boruvci extends CommandTrid{

    public Boruvci(Lokace lokace) {
        super(lokace);
    }

    @Override
    public String akceVeTride(String hodnota, Hrac hrac) {
        Predmet orisek = DataHry.getSingleton().getPredmety().get(lokace.getNazevPredmetu());
        orisek.akce(hrac);
        //ano
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
