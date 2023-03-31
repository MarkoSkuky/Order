package PisomkaAbstract;

public class Okres extends UzemnaJednotka {

    private Kraj kraj;

    public Okres(String kod, String nazov, Kraj kraj) {
        super(kod, nazov);
        this.kraj = kraj;
    }

    @Override
    void informujObcanov(String text) {
        System.out.println("V bytcianskych novinach je sprava: " + text);
    }
}
