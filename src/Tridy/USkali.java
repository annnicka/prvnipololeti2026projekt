package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Predmety.Predmet;

public class USkali extends CommandTrid{

    public USkali(Lokace lokace, DataHry dataHry) {
        super(lokace, dataHry);
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        Predmet kaminek = dataHry.getItems().get(lokace.getNazevPredmetu());
        kaminek.akce(hrac,dataHry);
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
