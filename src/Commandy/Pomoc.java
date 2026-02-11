package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;

public class Pomoc extends Command {
    //pridam dialog
    public Pomoc(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }
    /**
     * nepomuze
     * @param hodnota
     * @return
     */
    @Override
    public String execute(String hodnota) {
        return "nenene pomoz si sam";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
