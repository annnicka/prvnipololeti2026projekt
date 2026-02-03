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
        if(hrac.getB().predmetyVBatohu().equals("Kaminek")){
            System.out.println("ale ne v tunelu jeste nejsi asi uz blouznis");
        }
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
