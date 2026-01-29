package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;

public abstract class CommandTrid {
    protected Lokace lokace;
    protected DataHry dataHry;

    public CommandTrid(Lokace lokace,DataHry dataHry) {
        this.lokace = lokace;
        this.dataHry = dataHry;
    }

    public abstract String akceVeTride(String hodnota, Hrac hrac);
    public abstract boolean exit();

}
