package Konzole;

import Commandy.Command;
import Commandy.Jdi;
import Commandy.Konec;
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

    public Konzole(DataHry dataHry) {
        this.jeExit = false;
        this.dataHry = dataHry;
        inicialization();
        iniciaceTrid();
    }

    /**
     * iniciace commandu
     */
    public void inicialization() {
        this.commandy.put("jdi", new Jdi(dataHry, dataHry.getHrac()));
        this.commandy.put("konec", new Konec(dataHry, dataHry.getHrac()));
    }

    /**
     *ridi to cele zajistuje existenci commandu a pote zaridi vykonani
     */
    public void execute() {
        while(!this.jeExit) {
            System.out.print(">> ");
            String input = sc.nextLine();
            String[] command = input.trim().toLowerCase().split(" ");
            System.out.println(Arrays.toString(command));
            if (this.commandy.containsKey(command[0])) {
                Command com = this.getCommands().get(command[0]);
                System.out.println(com.execute(command[1]));
                this.jeExit = com.exit();
            } else {
                System.out.println("Tento komand neexistuje");
            }
        }
        sc.close();
    }

    /**
     * uklada commandy
     * @return
     */
    public HashMap<String, Command> getCommands() {
        return this.commandy;
    }
    public void iniciaceTrid() {
        this.presmerovaniDoTrid.put("Boruvci", new Boruvci(dataHry, dataHry.getHrac()));
        this.presmerovaniDoTrid.put("Domov", new Domov(dataHry, dataHry.getHrac()));
        this.presmerovaniDoTrid.put("Doupe", new Doupe(dataHry, dataHry.getHrac()));
        this.presmerovaniDoTrid.put("Louka", new Louka(dataHry, dataHry.getHrac()));
        this.presmerovaniDoTrid.put("OkrajLesa", new OkrajLesa(dataHry, dataHry.getHrac()));
        this.presmerovaniDoTrid.put("Potok", new Potok(dataHry, dataHry.getHrac()));
        this.presmerovaniDoTrid.put("Tunel", new Tunel(dataHry, dataHry.getHrac()));
        this.presmerovaniDoTrid.put("USkali", new USkali(dataHry, dataHry.getHrac()));

    }
    public void akceVeTride() {
        while(!this.jeExit) {
            System.out.print(">> ");
            String input = sc.nextLine();
            String[] command = input.trim().toLowerCase().split(" ");
            System.out.println(Arrays.toString(command));
            if (this.presmerovaniDoTrid.containsKey(command[0])) {
                CommandTrid com = this.getPresmerovaniDoTrid().get(command[0]);
                System.out.println(com.akceVeTride(command[1]));
                this.jeExit = com.exit();
            } else {
                System.out.println("Tento komand neexistuje");
            }
        }
        sc.close();
    }
    /**
     * uklada commandy
     * @return
     */
    public HashMap<String, CommandTrid> getPresmerovaniDoTrid() {
        return this.presmerovaniDoTrid;
    }

}


