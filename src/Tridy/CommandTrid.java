package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;

public abstract class CommandTrid {
    protected Lokace lokace;

    public CommandTrid(Lokace lokace) {
        this.lokace = lokace;
    }

    public abstract String akceVeTride(String hodnota, Hrac hrac);
    public abstract boolean exit();

}
