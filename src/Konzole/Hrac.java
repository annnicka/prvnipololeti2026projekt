package Konzole;

import Commandy.Command;

import java.util.Arrays;

public class Hrac {
    /**
     * misto kde se nachazi
     */
    private String mapId;
    private String cilovaLokace;
    private Batoh b;

    public Hrac() {
        this.mapId = mapId;
        this.b = new Batoh();
    }

    public void setCilovaLokace(String cilovaLokace) {
        this.cilovaLokace = cilovaLokace;
    }

    public String getCilovaLokace() {
        return cilovaLokace;
    }

    public Batoh getB() {
        return b;
    }

    public void setB(Batoh b) {
        this.b = b;
    }

    public String getMapId() {
        return mapId;
    }

    public void setMapId(String mapId) {
        this.mapId = mapId;
    }
//          while(!this.jeExit) {
//        System.out.println("tak a ted muzes napsat jen slovo a stane se: jdi +(svetova strana),konec,kuk(nakouknuti do batohu),odevzdat,pomoc,vzit");
//        System.out.print(">> ");
//        String input = sc.nextLine();
//        String[] command = input.trim().split(" ");
//        System.out.println(Arrays.toString(command));
//        if(hrac.getMapId().equals(command)&&command.equals("skala") &&hrac.getB().getPredmetyVBatohu().contains("Orisek")){
////                System.out.println(com.execute(command[1]));
//            presmerovaniDoTrid.get(input).akceVeTride(null,hrac);
//        }else if(hrac.getMapId().equals(command)&&command.equals("potok") &&hrac.getB().getPredmetyVBatohu().contains("Pericko")){
//            presmerovaniDoTrid.get(input).akceVeTride(null,hrac);
//        }else if (hrac.getMapId().equals(command)&&command.equals("doupe") &&hrac.getB().getPredmetyVBatohu().contains("Kaminek")){
//            presmerovaniDoTrid.get(input).akceVeTride(null,hrac);
//        }
//        else if (this.commandy.containsKey(command[0])) {
//            Command com = this.getCommands().get(command[0]);
//            if (!command[0].equals("jdi")) {
//                System.out.println(com.execute(null));
//            } else {
//                System.out.println(com.execute(command[1]));
//            }
//            this.jeExit = com.exit();
//        } else if(presmerovaniDoTrid.containsKey(input)) {
////                akceVeTride();
//            presmerovaniDoTrid.get(input).akceVeTride(null,hrac);
////                input.equals("Boruvci")|| input.equals("Domov")|| input.equals("Doupe")||
////                        input.equals("Louka")|| input.equals("OkrajLesa")|| input.equals("Potok")|| input.equals("Tunel")|| input.equals("Skala")
//        }
//        else {
//            System.out.println("Tento komand neexistuje");
//        }
//
//    }
//}
}
