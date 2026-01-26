package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Predmety.Kaminek;

public class Potok extends CommandTrid {

    public Potok(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        Kaminek k  = new Kaminek();
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
