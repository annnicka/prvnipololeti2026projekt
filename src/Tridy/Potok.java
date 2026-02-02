package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Konzole.Konzole;
import Predmety.Predmet;

public class Potok extends CommandTrid {
    private Konzole konzole;

    public Potok(Lokace lokace, DataHry dataHry, Konzole konzole) {
        super(lokace, dataHry);
        this.konzole = konzole;
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        Predmet kaminek = dataHry.getItems().get("Kaminek");
        kaminek.akce(hrac,dataHry, konzole);
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
