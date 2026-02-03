package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;

public class Domov extends CommandTrid {

    public Domov(Lokace lokace, DataHry dataHry) {
        super(lokace, dataHry);
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        if(hrac.getB().predmetyVBatohu().equals("Kaminek")){
            System.out.println("ale ne doma jeste nejsi asi uz blouznis");
        }

        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
