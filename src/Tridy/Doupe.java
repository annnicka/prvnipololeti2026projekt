package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Konzole.Konzole;
import Postavy.HlavniHrabos;

import java.util.Scanner;

public class Doupe extends CommandTrid{
    private Konzole konzole;


    public Doupe(Lokace lokace, DataHry dataHry) {
        super(lokace, dataHry);
        this.konzole = konzole;
    }

    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tak a ted jen posledni otazka. Pomuzes nam az budeme v nozi? ano/ne");
        String odpoved = sc.nextLine();
        if(odpoved.equals("ano")){
            System.out.println("no dobra tak uz utikej domu");
            System.out.println("napis Domov");
            return "";
        }

        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
