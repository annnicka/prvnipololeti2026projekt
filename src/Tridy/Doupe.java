package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Postavy.HlavniHrabos;

public class Doupe extends CommandTrid{
    private HlavniHrabos hlavniHrabos;


    public Doupe(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        HlavniHrabos h = new HlavniHrabos();
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
