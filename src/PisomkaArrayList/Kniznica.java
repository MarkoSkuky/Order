package PisomkaArrayList;

import java.util.ArrayList;

public class Kniznica {

    private ArrayList<Kniha> knihy = new ArrayList<>();

    public Kniha getKnihaPodlaId(String id) {
        for (int i = 0; i < knihy.size(); i++) {
            if (knihy.get(i).getId().equals(id)) {
                System.out.println(knihy.get(i).toString());
                return knihy.get(i);
            }
        }
        return null;
    }
    public Kniha getKnihaPodlaNazvu(String nazov) {
        for (int i = 0; i < knihy.size(); i++) {
            if (knihy.get(i).getNazov().equals(nazov)) {
                System.out.println(knihy.get(i).toString());
                return knihy.get(i);
            }
        }
        return null;
    }
    public ArrayList<Kniha> getKnihaPodlaZanru(Zaner zaner) {
        ArrayList<Kniha> knihas = new ArrayList<>();
        for (int i = 0; i < knihy.size(); i++) {
            if (knihy.get(i).getTypZanru() == zaner) {
                knihas.add(knihy.get(i));
                System.out.println(knihas.get(i).toString());
            }
        }
        return knihas;
    }

    Kniznica() {

    }

    public boolean pridajKnihu(Kniha kniha) {
        for (int i = 0; i < knihy.size(); i++) {
            if (knihy.get(i).getId().equals(kniha.getId())) {
                System.out.println("V kniznici sa uz kniha nachadza ");
                return false;
            }
        }
        knihy.add(kniha);
        return true;
    }

    public Kniha vymazKnihu(String id) {
        for (int i = 0; i < knihy.size(); i++) {
            if (knihy.get(i).getId().equals(id)) {
                knihy.remove(i);
                return knihy.get(i);
            }
        }
        return null;
    }




}
