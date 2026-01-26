package Predmety;

import Konzole.Hrac;

import java.util.Random;
import java.util.Scanner;

public class Kaminek extends Predmet {

    public Kaminek() {
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

        System.out.println("aaa, nasel si kaminek");
        System.out.println("tak a ted uz jen musime do doupete. napis Doupe");
        konzole.akceVeTride();
    }

    @Override
    public void akce(Hrac hrac) {

    }
}
