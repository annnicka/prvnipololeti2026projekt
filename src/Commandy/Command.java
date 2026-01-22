package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;

/**
 *vzor pro Commandy
 */
public abstract class Command {
    protected DataHry dataHry;
    protected Hrac hrac;

    protected Command(DataHry dataHry, Hrac hrac) {
        this.dataHry = dataHry;
        this.hrac = hrac;
    }

    /**
     * to co ten command ma udelat a exit
     * @param hodnota
     * @return
     */
    public abstract String execute(String hodnota);
    public abstract boolean exit();


}
