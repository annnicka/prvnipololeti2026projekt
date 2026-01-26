package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;

public class Domov extends CommandTrid {

    public Domov(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        System.out.println("jee uz jsi doma");

        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
