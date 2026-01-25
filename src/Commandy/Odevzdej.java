package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;
import Predmety.Predmet;

public class Odevzdej extends Command {
    // nejdriv musim udelat inventare postav a batoh


    public Odevzdej(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }
    @Override
    public String execute(String hodnota) {
        Predmet predmet = dataHry.getPredmety().get(hodnota);
        hrac.getB().getPredmetyVBatohu().remove(predmet);
        return "odevzdal jsi "+predmet;
    }

    @Override
    public boolean exit() {
        return false;
    }
}
