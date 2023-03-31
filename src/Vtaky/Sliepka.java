package Vtaky;

public class Sliepka implements IVtak, INelietajuci {

    @Override
    public void kracaj() {
        System.out.println("sliepka kraca tarbavo");
    }

    @Override
    public void znesVajce() {
        System.out.println(" sliepka  zniesla vajce");
    }
}
