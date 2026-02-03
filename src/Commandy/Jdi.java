package Commandy;

import Konzole.DataHry;
import Konzole.Hra;
import Konzole.Hrac;
import Tridy.Lokace;

import java.util.Scanner;

public class Jdi extends Command {




    public Jdi(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }

    /**
     * umoznuje hraci pohybovat se a zakazuje hraci urcita mista
     * @param hodnota
     * @return
     */
    @Override
    public String execute(String hodnota) {
        //if (dataHry.obsahujeMapu(hrac.getMapId())) {
            Lokace l = dataHry.getLokace(hrac.getMapId());
            if (l.getVychody().get(hodnota) != null) {
                hrac.setMapId(l.getVychody().get(hodnota));
                return "nachazis se v " + l.getVychody().get(hodnota);

            }else{
                return "nic tu neni";
            }

    }



        @Override
    public boolean exit() {
        return false;
    }
}
