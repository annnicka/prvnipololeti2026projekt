package Tridy;

import Konzole.DataHry;
import Konzole.Hrac;
import Konzole.Konzole;
import Postavy.HlavniHrabos;

import java.util.Scanner;

public class Doupe extends CommandTrid{
    private Konzole konzole;
    private String name;


    public Doupe(Lokace lokace, DataHry dataHry) {
        super(lokace, dataHry);
        this.konzole = konzole;
    }

    /**
     * aktivovani hledani predmetu a ohlidani jestli sem muze
     * @param hodnota
     * @param hrac
     * @return
     */
    @Override
    public String akceVeTride(String hodnota,Hrac hrac) {
        String name = "Doupe";
        if(name.equals(hrac.getMapId())&&hrac.getB().jeVBatohu("Orisek")){
            Scanner sc = new Scanner(System.in);
            System.out.println("tak a ted jen posledni otazka. Pomuzes nam az budeme v nozi? ano/ne");
            String odpoved = sc.nextLine();
            if(odpoved.equals("ano")){
                System.out.println("no dobra tak uz utikej domu");
                System.out.println("napis Domov");
                return "";
            }
        }else if(name.equals(hrac.getMapId())&&!hrac.getB().jeVBatohu("Orisek")){
            return "nemas kaminek. vrat se az ho budes mit.";
        }
        return "nejdriv se sem musis dostat";

    }

    @Override
    public boolean exit() {
        return false;
    }
}
