package PisomkaArrayList;

public class Kniha {

    private String id;
    private String nazov;
    private Zaner typZanru;

    Kniha(String id, String nazov, Zaner typZanru) {
        this.id = id;
        this.nazov = nazov;
        this.typZanru = typZanru;
    }

    public String getId() {
        return id;
    }

    public String getNazov() {
        return nazov;
    }

    public Zaner getTypZanru() {
        return typZanru;
    }

    @Override
    public String toString() {
        return "Kniha{" +
                "id='" + id + '\'' +
                ", nazov='" + nazov + '\'' +
                ", typZanru=" + typZanru +
                '}';
    }
}
