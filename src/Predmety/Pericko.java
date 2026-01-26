package Predmety;

public class Pericko extends Predmet {

    public Pericko() {
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

        System.out.println("aaa, nasel si pericko");
        System.out.println("tak a ted musime pro kaminek k potoku. napis Potok");
        konzole.akceVeTride();
    }
}
