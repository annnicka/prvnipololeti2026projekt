package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;

public class Louka extends CommandTrid{
    private String name;

    public Louka(Lokace lokace, DataHry dataHry) {
        super(lokace, dataHry);
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        if(name.equals(hrac.getMapId())){
            return "jses na louce";
        }
        return "nejdriv se sem musis dostat";

    }

    @Override
    public boolean exit() {
        return false;
    }
}
