package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;
import Predmety.Predmet;

public class Seber extends Command {
    // nejdriv musim udelat inventare postav a batoh
    public Seber(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }
    @Override
    public String execute(String hodnota) {
        Predmet predmet = dataHry.getPredmety().get(hodnota);
        hrac.getB().getPredmetyVBatohu().add(predmet);
        return "do batohu jsi pridal "+ predmet;
    }

    @Override
    public boolean exit() {
        return false;
    }
}
