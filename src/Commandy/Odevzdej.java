package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;

public class Odevzdej extends Command {
    // nejdriv musim udelat inventare postav a batoh
    public Odevzdej(DataHry dataHry, Hrac hrac) {
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
