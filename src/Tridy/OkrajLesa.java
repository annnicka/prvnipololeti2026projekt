package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;

public class OkrajLesa extends CommandTrid{

    private OkrajLesa konzole;
    private String name;
    public OkrajLesa(Lokace lokace, DataHry dataHry) {
        super(lokace, dataHry);
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        if(name.equals(hrac.getMapId())){
            return "ses na okraji lesa";
        }
        return "nejdriv se sem musis dostat";

    }

    @Override
    public boolean exit() {
        return false;
    }
}
