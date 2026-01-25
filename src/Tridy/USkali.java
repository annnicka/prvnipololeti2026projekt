package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;

public class USkali extends CommandTrid{

    public USkali(DataHry dataHry, Hrac hrac) {
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
