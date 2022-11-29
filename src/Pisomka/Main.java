package Pisomka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Osoba[] pole = new Osoba[4];

        Boolean pokracovat = true;
        int pocet = 0;

        while (pokracovat == true | pocet == pole.length) {

            System.out.println("chces pridat osobu?");
            String suhlas = scanner.next();
            if (suhlas.equals("ano")) {
                pokracovat = true;
                System.out.println("zadaj meno");
                String meno = scanner.next();
                System.out.println("zadaj priezvisko");
                String priezvisko = scanner.next();
                System.out.println("zvol pohlavie osoby: ");
                System.out.println("1 = muz");
                System.out.println("0 = zena");
                int pohlavie = scanner.nextInt();
                if (pohlavie == 1) {
                    pole[pocet] = new Osoba(meno, priezvisko, Pohlavie.Muz);
                } else if (pohlavie == 0) {
                    pole[pocet] = new Osoba(meno, priezvisko, Pohlavie.Zena);
                }
                pocet++;

            } else if (suhlas.equals("nie")) {
                pokracovat = false;
            }


        }
        for (int i = 0; i <= pocet; i++) {
            System.out.println(pole[i]);
        }


    }
}
