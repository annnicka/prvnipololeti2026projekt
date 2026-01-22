package Konzole;

import Commandy.Command;
import Commandy.Jdi;
import Commandy.Konec;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * vyuziti commandu
 */
public class Konzole {
    private HashMap<String, Command> commandy = new HashMap<>();
    private boolean jeExit;
    private static Scanner scanner = new Scanner(System.in);
    private DataHry dataHry;

    public Konzole(DataHry dataHry) {
        this.jeExit = false;
        this.dataHry = dataHry;
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
            String input = scanner.nextLine();
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
        scanner.close();
    }

    /**
     * uklada commandy
     * @return
     */
    public HashMap<String, Command> getCommands() {
        return this.commandy;
    }
}


