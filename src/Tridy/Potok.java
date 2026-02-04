package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Konzole.Konzole;
import Predmety.Predmet;

public class Potok extends CommandTrid {
    private Konzole konzole;
    private String name;

    public Potok(Lokace lokace, DataHry dataHry, Konzole konzole) {
        super(lokace, dataHry);
        this.konzole = konzole;
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {

        String name = "Potok";
        if(name.equals(hrac.getMapId())&&hrac.getB().getPredmetyVBatohu().contains("Pericko")){
            Predmet kaminek = dataHry.getItems().get("Kaminek");
            kaminek.akce(hrac,dataHry, konzole);
        } else if(name.equals(hrac.getMapId())&&!hrac.getB().getPredmetyVBatohu().contains("Pericko")){
        return "nemas pericko. vrat se az ho budes mit.";
    }
        return "nejdriv se sem musis dostat";


    }

    @Override
    public boolean exit() {
        return false;
    }
}
