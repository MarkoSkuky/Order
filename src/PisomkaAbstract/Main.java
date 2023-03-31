package PisomkaAbstract;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<UzemnaJednotka> uzemneJednotky = new ArrayList<>();

        Kraj zilina = new Kraj("017", "Zilina");
        Okres bytca = new Okres("73", "Bytca", zilina);
        Obec kolarovice = new Obec("244", "Kolarovice", bytca);

        uzemneJednotky.add(zilina);
        uzemneJednotky.add(bytca);
        uzemneJednotky.add(kolarovice);

        for (int i = 0; i < uzemneJednotky.size(); i++) {
            uzemneJednotky.get(i).informujObcanov("Predlzuje sa karantena v zilinskom kraji na 2 tyzdne");
        }


    }
}
