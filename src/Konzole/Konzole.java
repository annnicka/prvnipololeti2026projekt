package Konzole;

import Commandy.*;
import Tridy.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * vyuziti commandu
 */
public class Konzole {
    private HashMap<String, Command> commandy = new HashMap<>();
    private HashMap<String, CommandTrid> presmerovaniDoTrid = new HashMap<>();
    private boolean jeExit;
    private static Scanner sc = new Scanner(System.in);
    private DataHry dataHry;
    private Hrac hrac;

    public Konzole(DataHry dataHry) {
        this.jeExit = false;
        this.dataHry = dataHry;
        inicialization();
        iniciaceTrid();
        hrac = dataHry.getHrac();
    }

    /**
     * iniciace commandu
     */
    public void inicialization() {
        this.commandy.put("jdi", new Jdi(dataHry, dataHry.getHrac()));
        this.commandy.put("konec", new Konec(dataHry, dataHry.getHrac()));
        this.commandy.put("kuk", new NahlednutiDoBatohu(dataHry, dataHry.getHrac()));
        this.commandy.put("odevzdat", new Odevzdej(dataHry, dataHry.getHrac(), this));
        this.commandy.put("pomoc", new Pomoc(dataHry, dataHry.getHrac()));
        this.commandy.put("vzit", new Seber(dataHry, dataHry.getHrac()));
        this.commandy.put("akce", new Akce(dataHry, dataHry.getHrac(), this));
    }

    /**
     *ridi to cele zajistuje existenci commandu a pote zaridi vykonani
     */
    public void execute() {
        while(!this.jeExit) {
            System.out.println("tak a ted muzes napsat jen slovo a stane se: jdi +(svetova strana),konec,kuk(nakouknuti do batohu),odevzdat,pomoc,vzit");
            System.out.print(">> ");
            String input = sc.nextLine();
            if (input.trim().isEmpty()) continue;

            String[] command = input.trim().split(" ");
            String commandKey = command[0].toLowerCase();
            String inputKey = input.trim().toLowerCase();

            // 1. Speciální akce pro Skálu (musíš tam být, napsat "skala" a mít oříšek)
            if (hrac.getMapId().equals("Skala") && inputKey.equals("skala") && hrac.getB().jeVBatohu("Orisek")) {
                presmerovaniDoTrid.get("skala").akceVeTride(null, hrac);

            // 2. Speciální akce pro Potok (musíš tam být, napsat "potok" a mít peříčko)
            } else if (hrac.getMapId().equals("Potok") && inputKey.equals("potok") && hrac.getB().jeVBatohu("Pericko")) {
                presmerovaniDoTrid.get("potok").akceVeTride(null, hrac);

            // 3. Speciální akce pro Doupě (musíš tam být, napsat "doupe" a mít kamínek)
            } else if (hrac.getMapId().equals("Doupe") && inputKey.equals("doupe") && hrac.getB().jeVBatohu("Kaminek")) {
                presmerovaniDoTrid.get("doupe").akceVeTride(null, hrac);

            // 4. Ostatní běžné příkazy (jdi, seber, batoh...)
            } else if (this.commandy.containsKey(commandKey)) {
                Command com = this.commandy.get(commandKey);
                if (commandKey.equals("jdi") && command.length > 1) {
                    System.out.println(com.execute(command[1])); // Příkaz s parametrem (např. "jdi sever")
                } else {
                    System.out.println(com.execute(null));       // Příkaz bez parametru (např. "batoh")
                }
                this.jeExit = com.exit();

            // 5. Pokud to není příkaz, zkusíme, jestli to není název lokace pro přesměrování
            } else if (presmerovaniDoTrid.containsKey(inputKey)) {
                 presmerovaniDoTrid.get(inputKey).akceVeTride(null, hrac);

            } else {
                System.out.println("Tento prikaz neexistuje");
            }
        }
    }

    /**
     * uklada commandy
     * @return
     */
    public HashMap<String, Command> getCommands() {
        return this.commandy;
    }
    public void iniciaceTrid() {
        this.presmerovaniDoTrid.put("boruvci", new Boruvci(dataHry.getLokace("Boruvci"),dataHry, this));
        this.presmerovaniDoTrid.put("domov", new Domov(dataHry.getLokace("Domov"),dataHry));
        this.presmerovaniDoTrid.put("doupe", new Doupe(dataHry.getLokace("Doupe"),dataHry));
        this.presmerovaniDoTrid.put("louka", new Louka(dataHry.getLokace("Louka"),dataHry));
        this.presmerovaniDoTrid.put("okrajlesa", new OkrajLesa(dataHry.getLokace("OkrajLesa"),dataHry));
        this.presmerovaniDoTrid.put("potok", new Potok(dataHry.getLokace("Potok"),dataHry, this));
        this.presmerovaniDoTrid.put("tunel", new Tunel(dataHry.getLokace("Tunel"),dataHry,this));
        this.presmerovaniDoTrid.put("skala", new USkali(dataHry.getLokace("Skala"),dataHry, this));

    }
    /**
     * uklada commandy a vyvolava je
     * @return
     */
    public void akceVeTride() {
        while(!this.jeExit) {
            System.out.println("tak a ted se pohybujes mezi mistnostmi jakozto ukoly");
            System.out.print(">> ");
            String input = sc.nextLine();
            String command = input.trim().toLowerCase();
            System.out.println(command);
            if (this.presmerovaniDoTrid.containsKey(command) ) {
                CommandTrid com = this.presmerovaniDoTrid.get(command);
//                if(command.equals("domov")&&command.equals("tunel")){
//                    if(hrac.getB().predmetyVBatohu().equals("Kaminek")){
//                        System.out.println(com.akceVeTride(command, hrac));
//                        this.jeExit = com.exit();
//                    }
//                }else if(!command.equals("domov")&&command.equals("tunel")){
                    System.out.println(com.akceVeTride(command, hrac));
                    this.jeExit = com.exit();


            } else {
                System.out.println("Tento komand neexistuje");
            }
        }
//        while(!this.jeExit) {
//            System.out.println("tak a ted se pohybujes mezi mistnostmi jakozto ukoly");
//            System.out.print(">> ");
//            String input = sc.nextLine();
//            String[] command = input.trim().toLowerCase().split(" ");
//            System.out.println(Arrays.toString(command));
//            if (this.presmerovaniDoTrid.containsKey(command[0]) && muzeJit(hrac.getMapId(), command[0])) {
//                CommandTrid com = this.presmerovaniDoTrid.get(command[0]);
//                System.out.println(com.akceVeTride(command[1], hrac));
//                this.jeExit = com.exit();
//            } else {
//                System.out.println("Tento komand neexistuje");
//            }
//        }

    }

    /**
     * overuje existenci lokace
     * @param mapId
     * @param cilovaLokace
     * @return
     */
    private boolean muzeJit(String mapId, String cilovaLokace) {
        Lokace lokace = dataHry.getLokace(mapId);
        return lokace.getVychody().containsValue(cilovaLokace);
    }
    /**
     * uklada commandy
     * @return
     */
    public HashMap<String, CommandTrid> getPresmerovaniDoTrid() {
        return this.presmerovaniDoTrid;
    }

}
