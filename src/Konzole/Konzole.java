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
        this.commandy.put("odevzdat", new Odevzdej(dataHry, dataHry.getHrac()));
        this.commandy.put("pomoc", new Pomoc(dataHry, dataHry.getHrac()));
        this.commandy.put("vzit", new Seber(dataHry, dataHry.getHrac()));
        this.commandy.put("akce", new Akce(dataHry, dataHry.getHrac(), this));
    }

    /**
     *ridi to cele zajistuje existenci commandu a pote zaridi vykonani
     */
    public void execute() {
        while(!this.jeExit) {
//            System.out.println("tak a ted muzes napsat jen slovo a stane se: jdi +(svetova strana),konec,kuk(nakouknuti do batohu),odevzdat,pomoc,vzit");
//            System.out.print(">> ");
//            String input = sc.nextLine();
//            if (input.trim().isEmpty()) continue;
//
//            String[] command = input.trim().split(" ");
//            String commandKey = command[0].toLowerCase();
//            String inputKey = input.trim().toLowerCase();
//            while(!this.jeExit) {
        System.out.println("tak a ted muzes napsat jen slovo a stane se: jdi +(svetova strana),konec,kuk(nakouknuti do batohu),odevzdat,pomoc,vzit");
        System.out.print(">> ");
        String input = sc.nextLine();
        String[] command = input.trim().split(" ");
        System.out.println(Arrays.toString(command));
        if(hrac.getMapId().equals(command)&&command.equals("skala") &&hrac.getB().getPredmetyVBatohu().contains("Orisek")){
//                System.out.println(com.execute(command[1]));
            presmerovaniDoTrid.get(input).akceVeTride(null,hrac);
        }else if(hrac.getMapId().equals(command)&&command.equals("potok") &&hrac.getB().getPredmetyVBatohu().contains("Pericko")){
            presmerovaniDoTrid.get(input).akceVeTride(null,hrac);
        }else if (hrac.getMapId().equals(command)&&command.equals("doupe") &&hrac.getB().getPredmetyVBatohu().contains("Kaminek")){
            presmerovaniDoTrid.get(input).akceVeTride(null,hrac);
        }
        else if (this.commandy.containsKey(command[0])) {
            Command com = this.getCommands().get(command[0]);
            if (!command[0].equals("jdi")) {
                System.out.println(com.execute(null));
            } else {
                System.out.println(com.execute(command[1]));
            }
            this.jeExit = com.exit();
        } else if(presmerovaniDoTrid.containsKey(input)) {
//                akceVeTride();
            presmerovaniDoTrid.get(input).akceVeTride(null,hrac);
//                input.equals("Boruvci")|| input.equals("Domov")|| input.equals("Doupe")||
//                        input.equals("Louka")|| input.equals("OkrajLesa")|| input.equals("Potok")|| input.equals("Tunel")|| input.equals("Skala")
        }
        else {
            System.out.println("Tento komand neexistuje");
        }

    }
}

            // System.out.println(Arrays.toString(command)); // Debug vypis

//            if (this.commandy.containsKey(commandKey)) {
//                Command com = this.getCommands().get(commandKey);
//                if (commandKey.equals("jdi") && command.length > 1) {
//                    System.out.println(com.execute(command[1]));
//                } else {
//                    System.out.println(com.execute(null));
//                }
//                this.jeExit = com.exit();
//            } else if(presmerovaniDoTrid.containsKey(inputKey)) {
//                if(commandKey.equals(hrac.getMapId())&&inputKey.equals("skala")&&hrac.getB().jeVBatohu("Orisek")){
//                    presmerovaniDoTrid.get(inputKey).akceVeTride(null,hrac);
//                }else if(inputKey.equals(hrac.getMapId())&&inputKey.equals("potok")&&hrac.getB().jeVBatohu("Pericko")){
//                    presmerovaniDoTrid.get(inputKey).akceVeTride(null,hrac);
//                }else if(inputKey.equals(hrac.getMapId())&&inputKey.equals("doupe")&&hrac.getB().jeVBatohu("Kaminek")){
//                    presmerovaniDoTrid.get(inputKey).akceVeTride(null,hrac);
//                }
//                ;
//            }
//            else {
//                System.out.println("Tento komand neexistuje");
//            }
//        }
//    }

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
