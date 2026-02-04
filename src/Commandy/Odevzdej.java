package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;
import Konzole.Konzole;
import Predmety.Predmet;

import java.util.Scanner;

public class Odevzdej extends Command {
    private Konzole konzole;

    public Odevzdej(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
        this.konzole = konzole;
    }

    @Override
    public String execute(String hodnota) {
        // Pokud ma hrac kaminek, spusti se zaverecny dialog
        if(hrac.getB().jeVBatohu("Kaminek")){
            hrac.getB().odebiraniZBatohu();
            System.out.println("Hlavni Hrabos: super diky moc(napis doupe)");
            return "";
        } else if(hrac.getB().getPredmetyVBatohu().isEmpty()){
            return "batoh je prazdny";
        } else {
            System.out.println("jeste nemas vsechno");
//            // Pokud se snazi odevzdat konkretni predmet
//            if (hodnota != null && !hodnota.isEmpty()) {
//                if (hrac.getB().jeVBatohu(hodnota)) {
//                    // Najdeme predmet v datech hry (nebo v batohu, ale dataHry maji mapu vsech predmetu)
//                    // Pozor: dataHry.getItems().get(hodnota) vrati instanci z mapy, ne nutne tu v batohu,
//                    // ale pokud equals funguje nebo je to stejna instance, melo by to jit.
//                    // Pro jistotu najdeme predmet v batohu.
//                    Predmet kOdebrani = null;
//                    for(Predmet p : hrac.getB().getPredmetyVBatohu()) {
//                        if(p.getName().equals(hodnota)) {
//                            kOdebrani = p;
//                            break;
//                        }
//                    }
//
//                    if (kOdebrani != null) {
//                        hrac.getB().odebiraniZBatohu(kOdebrani);
//                        return "odevzdal jsi " + kOdebrani.getName();
//                    }
//                }
//                return "Takovy predmet v batohu nemas.";
//            }
            return "Nevim co mam odevzdat.";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
