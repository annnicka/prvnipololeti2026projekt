package Postavy;

import Konzole.Konzole;
import Konzole.Hrac;

import java.util.ArrayList;
import java.util.Scanner;

public class HlavniHrabos extends Postava {
    private ArrayList<String> hrabosPredmety;
    private Konzole konzole;
    private Hrac hrac;
    // nemuzu mu dat cilovou destinaci


    public HlavniHrabos(Hrac hrac, Konzole konzole) {
        this.hrac = hrac;
        this.konzole = konzole;
        this.hrabosPredmety = new ArrayList<>();
    }

    public String dialogNaZacatkuHry(){
        //TODO zacatek hry
        return "Ahoj mysaku";
    }

    public String dialogH2(){
        System.out.println();
        return "ano";
    }

    public String dialogH3(){



//        this.hrabosPredmety = new ArrayList<>();
        dialogH2();
        return "";
    }



}
