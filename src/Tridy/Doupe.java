package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Postavy.HlavniHrabos;

public class Doupe extends CommandTrid{
    private HlavniHrabos hlavniHrabos;


    public Doupe(Lokace lokace, DataHry dataHry) {
        super(lokace, dataHry);

    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        hlavniHrabos.dialogH3();
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
