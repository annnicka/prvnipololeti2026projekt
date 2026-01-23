package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;


public class Konec extends Command {
    public Konec(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }
    @Override
    public String execute(String hodnota) {
        System.out.println();
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
