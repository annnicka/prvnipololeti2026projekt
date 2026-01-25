package Konzole;

import Predmety.Predmet;

import java.util.ArrayList;

/**
 * batoh ma hrac u sebe a sbira sem predmety
 */
public class Batoh {
    private ArrayList<Predmet> predmetyVBatohu;

    public Batoh(ArrayList<Predmet> predmetyVBatohu) {
        this.predmetyVBatohu = new ArrayList<>();
    }


    public ArrayList<Predmet> getPredmetyVBatohu() {
        return predmetyVBatohu;
    }

    public void setPredmetyVBatohu(ArrayList<Predmet> predmetyVBatohu) {
        this.predmetyVBatohu = predmetyVBatohu;
    }
}
