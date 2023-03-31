package Vtaky;

public class Holub implements IVtak, ILietajuci {


    @Override
    public void lietaj() {
        System.out.println("holub leti halabala");
    }

    @Override
    public void znesVajce() {
        System.out.println(" holub zniesol vajce");
    }
}
