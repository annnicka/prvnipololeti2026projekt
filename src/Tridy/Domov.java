package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;

public class Domov extends CommandTrid {
        private String name;
    public Domov(Lokace lokace, DataHry dataHry) {
        super(lokace, dataHry);
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
//        if(hrac.getB().predmetyVBatohu().equals("Kaminek")){
//            System.out.println("ale ne doma jeste nejsi asi uz blouznis");
//            return "";
//        }
        if(name.equals(hrac.getMapId())){
            System.out.println("aaa a ses doma gratuluju! a ted uz jen napis konec");
            return "";
        }
       return "nejdriv se sem musis dostat";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
