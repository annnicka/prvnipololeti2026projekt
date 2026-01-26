package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;

public class OkrajLesa extends CommandTrid{

    public OkrajLesa(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
