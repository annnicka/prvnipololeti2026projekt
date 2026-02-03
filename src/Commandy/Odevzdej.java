package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;
import Predmety.Predmet;

public class Odevzdej extends Command {
    // nejdriv musim udelat inventare postav a batoh


    public Odevzdej(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }
    @Override
    public String execute(String hodnota) {
        //TODO pridat jestli ma v batohu kaminek a jestli ano tak zacne konecny dialog
        if(hrac.getB().getPredmetyVBatohu().get()){

        }else if(hrac.getB().getPredmetyVBatohu().isEmpty()){
            return "batoh je prazdny";
        }else if(!hrac.getB().getPredmetyVBatohu().isEmpty()){
        Predmet predmet = dataHry.getItems().get(hodnota);
        hrac.getB().getPredmetyVBatohu().remove(predmet);
        return "odevzdal jsi "+predmet;

        }

    }

    @Override
    public boolean exit() {
        return false;
    }
}
