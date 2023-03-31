package Vtaky;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        List<IVtak> vtaky = new ArrayList<>();

        vtaky.add(new Holub());
        vtaky.add(new Holub());
        vtaky.add(new Holub());

        vtaky.add(new Sliepka());
        vtaky.add(new Sliepka());
        vtaky.add(new Sliepka());

        for (int i = 0; i < vtaky.size(); i++) {
            int randomCislo = random.nextInt(100)+1;
            if (randomCislo <= 40) {
                vtaky.get(i).znesVajce();
            }

            if (vtaky.get(i) instanceof Holub) {
                ((Holub) vtaky.get(i)).lietaj();

            } else if (vtaky.get(i) instanceof Sliepka) {
                ((Sliepka) vtaky.get(i)).kracaj();

            }




        }

    }
}
