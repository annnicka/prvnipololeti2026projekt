package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Konzole.Konzole;
import Predmety.Predmet;

public class USkali extends CommandTrid{
    private Konzole konzole;

    public USkali(Lokace lokace, DataHry dataHry, Konzole konzole) {
        super(lokace, dataHry);
        this.konzole = konzole;
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        Predmet pericko = dataHry.getItems().get("Pericko");
        pericko.akce(hrac,dataHry, konzole);
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
