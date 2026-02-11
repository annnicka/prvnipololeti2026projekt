package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;


public class Konec extends Command {
    public Konec(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }

    /**
     * ukonci hru
     * @param hodnota
     * @return
     */
    @Override
    public String execute(String hodnota) {
        return "no dobrá tak třeba příště";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
