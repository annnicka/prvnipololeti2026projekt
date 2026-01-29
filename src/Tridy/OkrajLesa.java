package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;

public class OkrajLesa extends CommandTrid{

    public OkrajLesa(Lokace lokace, DataHry dataHry) {
        super(lokace, dataHry);
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
