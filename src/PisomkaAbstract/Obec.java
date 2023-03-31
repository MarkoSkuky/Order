package PisomkaAbstract;

public class Obec extends UzemnaJednotka {

    private Okres okres;

    public Obec(String kod, String nazov, Okres okres) {
        super(kod, nazov);
        this.okres = okres;
    }


    @Override
    void informujObcanov(String text) {
        System.out.println("V kolarovskom rozhlase a na urade odoznela sprava: " + text);
    }
}
