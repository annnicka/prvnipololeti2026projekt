package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;
import Predmety.Predmet;

public class Seber extends Command {
    public Seber(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }
    /**
     * prida predmet do batohu
     * @param hodnota
     * @return
     */
    @Override
    public String execute(String hodnota) {
        Predmet predmet = dataHry.getItems().get(hodnota);
        hrac.getB().getPredmetyVBatohu().add(predmet);
        return "do batohu jsi pridal "+ predmet;
    }

    @Override
    public boolean exit() {
        return false;
    }
}
