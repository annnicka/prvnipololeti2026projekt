package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;

public class Pomoc extends Command {
    public Pomoc(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }
    @Override
    public String execute(String hodnota) {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
