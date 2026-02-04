package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Konzole.Konzole;
import Predmety.Predmet;

public class Boruvci extends CommandTrid{
    private Konzole konzole;


    public Boruvci(Lokace lokace, DataHry dataHry, Konzole konzole) {
        super(lokace, dataHry);
        this.konzole = konzole;
    }

    @Override
    public String akceVeTride(String hodnota, Hrac hrac) {
        String name =lokace.getName();
//        if(name.equals(hrac.getMapId())){
//            Predmet orisek = dataHry.getItems().get(lokace.getNazevPredmetu());
            Predmet orisek = dataHry.getItems().get("Orisek");
            orisek.akce(hrac,dataHry, konzole);
            //ano
            return "";
//        }
//            return "nejdriv se sem musis dostat";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
