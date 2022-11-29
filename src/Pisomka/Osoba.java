package Pisomka;

public class Osoba {
    private String meno;
    private String priezvisko;
    private Pohlavie pohlavie;

    public Osoba(String meno, String priezvisko, Pohlavie pohlavie) {
        this.meno = meno;
        this.pohlavie = pohlavie;
        this.priezvisko = priezvisko;
    }

    public Osoba() {

    }

    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public Pohlavie getPohlavie() {
        return pohlavie;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", pohlavie=" + pohlavie +
                '}';
    }
}
