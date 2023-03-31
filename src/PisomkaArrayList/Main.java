package PisomkaArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Kniznica kniznica = new Kniznica();
        kniznica.pridajKnihu(new Kniha("1", "metro", Zaner.SCIFI));
        kniznica.pridajKnihu(new Kniha("2", "metro 2", Zaner.SCIFI));
        kniznica.pridajKnihu(new Kniha("3", "vesmir", Zaner.NAUCNA));

        kniznica.getKnihaPodlaNazvu("metro 2");
        kniznica.getKnihaPodlaZanru(Zaner.SCIFI);

        kniznica.pridajKnihu(new Kniha("4", "vlacik", Zaner.NAUCNA));
        kniznica.getKnihaPodlaId("4");



    }
}
