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


    public HlavniHrabos() {
        this.hrabosPredmety = new ArrayList<>();
    }

    public String dialogNaZacatkuHry(){
        String ano = "dialog";
        return ano;
    }

    public String dialogH2(){
        System.out.println();
        return "ano";
    }

    public String dialogH3(Konzole konzole){
        this.konzole = konzole;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hlavni hrabos: jako prvni mi musis odevzdat to co si nasbiral");
        do{
            konzole.execute();
        }
        while (!hrac.getB().predmetyVBatohu().isEmpty());
        System.out.println("tak a ted jen posledni otazka. Pomuzes nam az budeme v nozi? ano/ne");
        String odpoved = sc.nextLine();
        if(odpoved.equals("ano")){
            System.out.println("no dobra tak uz utikej domu");
            System.out.println("napis Tunel a nasledne Domov");
            konzole.akceVeTride();
        }


        this.hrabosPredmety = new ArrayList<>();
        dialogH2();
        return "";
    }



}
