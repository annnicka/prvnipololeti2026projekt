package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Predmety.Predmet;

public class Potok extends CommandTrid {

    public Potok(Lokace lokace, DataHry dataHry) {
        super(lokace, dataHry);
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        Predmet orisek = dataHry.getItems().get(lokace.getNazevPredmetu());
        orisek.akce(hrac,dataHry);
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
