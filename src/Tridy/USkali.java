package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Konzole.Konzole;
import Predmety.Predmet;

public class USkali extends CommandTrid{
    private Konzole konzole;
    private String name;

    public USkali(Lokace lokace, DataHry dataHry, Konzole konzole) {
        super(lokace, dataHry);
        this.konzole = konzole;
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        String name = "Skala";
        if(name.equals(hrac.getMapId())&& hrac.getB().getPredmetyVBatohu().contains("Orisek")){
            Predmet pericko = dataHry.getItems().get("Pericko");
            pericko.akce(hrac,dataHry, konzole);
            return "";
        } else if(name.equals(hrac.getMapId())&&!hrac.getB().getPredmetyVBatohu().contains("Orisek")){
        return "nemas orisek. vrat se az ho budes mit.";
    }
        return "nejdriv se sem musis dostat";

    }

    @Override
    public boolean exit() {
        return false;
    }
}
