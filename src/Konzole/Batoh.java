package Konzole;

import Predmety.Predmet;

import java.util.ArrayList;

/**
 * batoh ma hrac u sebe a sbira sem predmety
 */
public class Batoh {
    private ArrayList<Predmet> predmetyVBatohu;

    public Batoh() {
        this.predmetyVBatohu = new ArrayList<>();
    }
    public String pridatDoBatohu(Predmet predmet){
        predmetyVBatohu.add(predmet);
        return " pridano do batohu";
    }
    public String odebiraniZBatohu(Predmet predmet){
        predmetyVBatohu.remove(predmet);
        return " odebrano z batohu";
    }

    public ArrayList<Predmet> predmetyVBatohu(){
        return predmetyVBatohu;
    }
    public ArrayList<Predmet> getPredmetyVBatohu() {
        return predmetyVBatohu;
    }

    public void setPredmetyVBatohu(ArrayList<Predmet> predmetyVBatohu) {
        this.predmetyVBatohu = predmetyVBatohu;
    }
}
