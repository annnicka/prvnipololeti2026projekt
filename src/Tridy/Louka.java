package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;

public class Louka extends CommandTrid{

    public Louka(Lokace lokace) {
        super(lokace);
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
