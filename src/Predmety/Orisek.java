package Predmety;

import Konzole.*;

import java.util.Random;
import java.util.Scanner;

public class Orisek extends Predmet {
    private Konzole konzole;
    private DataHry dataHry;

    public Orisek() {


    }

    @Override
    public void akce(Hrac hrac) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("pokyny");
        int opakovani = rd.nextInt(0,3);
        try{
            for (int i = 0; i < opakovani; i++) {
                int cekani = 500*i;
                Thread.sleep(cekani);
                System.out.println("ajajaj nikde nic hledame dal");

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("aaa, nasel si orisek");
        System.out.println("tak a ted musime pro pericko ke skale. napis Skala");
        konzole.akceVeTride();
    }
}
