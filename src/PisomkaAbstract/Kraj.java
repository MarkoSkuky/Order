package PisomkaAbstract;

public class Kraj extends UzemnaJednotka {

    public Kraj(String kod, String nazov) {
        super(kod, nazov);
    }

    @Override
    void informujObcanov(String text) {
        System.out.println("Do televizii v ziline sa dostala sprava: " + text);
    }
}
