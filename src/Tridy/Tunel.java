package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Konzole.Konzole;

public class Tunel extends CommandTrid{
    private Konzole konzole;

    public Tunel(Lokace lokace, DataHry dataHry, Konzole konzole) {
        super(lokace, dataHry);
        this.konzole = konzole;
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        System.out.println("jses v tunelu a ted uz se dostan jen domu");
        konzole.akceVeTride();

        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
