package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;

public class NahlednutiDoBatohu extends Command{
    public NahlednutiDoBatohu(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }

    /**
     * nahledne do batohu
     * @param hodnota
     * @return
     */
    @Override
    public String execute(String hodnota) {
        return String.valueOf(hrac.getB().getPredmetyVBatohu());
    }

    @Override
    public boolean exit() {
        return false;
    }
}
