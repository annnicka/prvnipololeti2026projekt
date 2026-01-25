package Commandy;

import Konzole.DataHry;
import Konzole.Hrac;

public class Akce extends Command {
    protected Akce(DataHry dataHry, Hrac hrac) {
        super(dataHry, hrac);
    }
//yacne mi ten dej hrz a ve tride mistnost udelam neco jako tz komandz ale jako budou to tridy a vyzdy kdyz nekam prijdu tak se nastartuje ta cast hry v te tride
    @Override
    public String execute(String hodnota) {

        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
