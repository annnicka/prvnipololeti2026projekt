package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;

public class Domov extends CommandTrid {
        private String name;
    public Domov(Lokace lokace, DataHry dataHry) {
        super(lokace, dataHry);
    }

    /**
     *
     * @param hodnota
     * @param hrac
     * @return
     */
    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {

        name = "Doupe";
        if(name.equals(hrac.getMapId())){
            System.out.println("aaa a ses doma gratuluju! ");
           System.exit(0);
            return " ";
        }
       return " ";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
