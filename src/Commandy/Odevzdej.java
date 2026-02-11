package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;
import Konzole.Konzole;
import Predmety.Predmet;

import java.util.Scanner;

public class Odevzdej extends Command {
    private Konzole konzole;

    public Odevzdej(DataHry dataHry, Hrac hrac, Konzole konzole) {
        super(dataHry, hrac);
        this.konzole = konzole;
    }

    /**
     * odebere predmet z batohu
     * @param hodnota
     * @return
     */
    @Override
    public String execute(String hodnota) {
        // Pokud ma hrac kaminek, spusti se zaverecny dialog
        if(hrac.getB().jeVBatohu("Kaminek")){
            hrac.getB().odebiraniVsehoZBatohu(hodnota);
            System.out.println("Hlavni Hrabos: super diky moc(napis doupe)");
            return "";
        } else if(hrac.getB().getPredmetyVBatohu().isEmpty()){
            return "batoh je prazdny";
        } else {
            System.out.println("jeste nemas vsechno");

            return "Nevim co mam odevzdat.";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
