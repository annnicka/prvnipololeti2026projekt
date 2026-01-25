package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;

public class Doupe extends CommandTrid{

    public Doupe(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }

    @Override
    public String akceVeTride(String hodnota) {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
