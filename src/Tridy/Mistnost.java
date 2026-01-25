package Tridy;

import Commandy.Command;
import Commandy.Jdi;
import Commandy.Konec;
import Konzole.DataHry;
import Konzole.Hrac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public abstract class Mistnost{

    private HashMap<String, CommandTrid> presmerovaniDoTrid = new HashMap<>();
    private boolean jeExit;
    private static Scanner sc = new Scanner(System.in);
    private DataHry dataHry;

    public Mistnost(HashMap<String, CommandTrid> presmerovaniDoTrid, boolean jeExit, DataHry dataHry) {
        this.presmerovaniDoTrid = presmerovaniDoTrid;
        this.jeExit = false;
        this.dataHry = dataHry;
    }

    /**
     * iniciace commandu
     */
    public void iniciaceTrid() {
        this.presmerovaniDoTrid.put("Boruvci", new Boruvci(dataHry, dataHry.getHrac()));
        this.presmerovaniDoTrid.put("Domov", new Domov());
        this.presmerovaniDoTrid.put("Doupe", new Doupe());
        this.presmerovaniDoTrid.put("Louka", new Louka() );
        this.presmerovaniDoTrid.put("OkrajLesa", new OkrajLesa());
        this.presmerovaniDoTrid.put("Potok", new Potok());
        this.presmerovaniDoTrid.put("Tunel", new Tunel() );
        this.presmerovaniDoTrid.put("USkali", new USkali());

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
            if (this.presmerovaniDoTrid.containsKey(command[0])) {
                CommandTrid com = this.getPresmerovaniDoTrid().get(command[0]);
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
    public HashMap<String, CommandTrid> getPresmerovaniDoTrid() {
        return this.presmerovaniDoTrid;
    }



}
