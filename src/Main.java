public class Main {
    public static void main(String[] args) {

        Skola skola = new Skola("SSOSZA", 154, true);
        Skola skola1 = new Skola();

        skola.infoSkoly();

        skola1.setPocetZiakov(215);

        System.out.println("pocet ziakov druhej skoly " + skola1.getPocetZiakov());




    }

}
