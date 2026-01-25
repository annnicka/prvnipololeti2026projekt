package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;

public abstract class CommandTrid {
    protected DataHry dataHry;
    protected Hrac hrac;

    protected CommandTrid(DataHry dataHry, Hrac hrac) {
        this.dataHry = dataHry;
        this.hrac = hrac;
    }

    public abstract String akceVeTride(String hodnota);
    public abstract boolean exit();

}
