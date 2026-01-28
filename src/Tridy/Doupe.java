package Tridy;

import Konzole.Hrac;
import Postavy.HlavniHrabos;

public class Doupe extends CommandTrid{
    private HlavniHrabos hlavniHrabos;


    public Doupe(Lokace lokace) {
        super(lokace);

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
