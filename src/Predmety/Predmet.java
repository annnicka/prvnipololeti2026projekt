package Predmety;

import Konzole.Hrac;
import Konzole.Konzole;
import Konzole.DataHry;

import java.util.Random;

public class Predmet {
    protected String name;
    protected String location;
    protected Prenostnost prenosnost;
    protected Konzole konzole;
    protected String textPoNalezeni;

    public void akce(Hrac hrac) {
        Random rd = new Random();
        System.out.println("pokyny");
        int opakovani = rd.nextInt(0,3);
        try{
            for (int i = 0; i < opakovani; i++) {
                Thread.sleep(500L *i);
                System.out.println("ajajaj nikde nic hledame dal");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        hrac.getB().getPredmetyVBatohu().add(DataHry.getSingleton().getPredmety().get(name));
        System.out.println(textPoNalezeni);
        hrac.setCilovaLokace(location);
        konzole.akceVeTride();
    }
}
