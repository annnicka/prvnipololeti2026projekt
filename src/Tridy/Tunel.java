package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Konzole.Konzole;

public class Tunel extends CommandTrid{
    private Konzole konzole;
    private String name;

    public Tunel(Lokace lokace, DataHry dataHry, Konzole konzole) {
        super(lokace, dataHry);
        this.konzole = konzole;
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {

        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
