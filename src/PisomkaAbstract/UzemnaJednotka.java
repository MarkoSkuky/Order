package PisomkaAbstract;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public abstract class UzemnaJednotka {

    private String kod;
    private String nazov;

    public UzemnaJednotka(String kod, String nazov) {
        this.kod = kod;
        this.nazov = nazov;
    }

    public String getNazov() {
        return nazov;
    }

    public String getKod() {
        return kod;
    }

    abstract void informujObcanov(String text);
}
