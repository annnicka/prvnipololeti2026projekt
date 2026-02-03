package Predmety;

import Konzole.Hrac;
import Konzole.Konzole;
import Konzole.DataHry;
import java.util.Random;

public class Predmet {
    protected String name;
    protected String location;
    protected Prenostnost prenosnost;
    protected String textPoNalezeni;

    public void akce(Hrac hrac, DataHry dataHry, Konzole konzole) {
        Random rd = new Random();
        System.out.println("tak a ted tu najdi "+ name);
        int opakovani = rd.nextInt(0,3);
        try{
            for (int i = 0; i < opakovani; i++) {Thread.sleep(1000 *(i+1));
                System.out.println("ajajaj nikde nic hledame dal");

            }
            Thread.sleep(1000 );
            System.out.println("super nasli jsme to");
            Thread.sleep(1000 );
            System.out.println(textPoNalezeni);
            Thread.sleep(1000 );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        hrac.getB().getPredmetyVBatohu().add(dataHry.getItems().get(name));
        hrac.getB().pridatDoBatohu(dataHry.getItems().get(name));
        hrac.setCilovaLokace(location);


    }
}
