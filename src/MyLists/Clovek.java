package MyLists;

public class Clovek {
    private String meno;
    private int vek;

    Clovek(String meno, int vek) {
        this.meno = meno;
        this.vek = vek;
    }

    @Override
    public String toString() {
        return "Clovek{" +
                "meno='" + meno + '\'' +
                ", vek=" + vek +
                '}';
    }
}
