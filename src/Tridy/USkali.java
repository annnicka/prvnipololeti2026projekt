package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Predmety.Pericko;

public class USkali extends CommandTrid{

    public USkali(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        Pericko p = new Pericko();
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
