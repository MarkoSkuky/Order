public class Skola {
    private String nazovSkoly;
    private int pocetZiakov = 0;
    private boolean odborna = false;

    public Skola(String nazovSkoly, int pocetZiakov, boolean odborna){
        this.nazovSkoly = nazovSkoly;
        this.pocetZiakov = pocetZiakov;
        this.odborna = odborna;
        if (pocetZiakov < 0){this.pocetZiakov = 0;}
    }
    public Skola(){

    }
    public String getNazovSkoly(){
        return nazovSkoly;
    }
    public int getPocetZiakov(){
        return pocetZiakov;
    }
    public boolean isOdborna(){
        return odborna;
    }
    public void setNazovSkoly(String nazovSkoly){
        this.nazovSkoly = nazovSkoly;
    }
    public void setPocetZiakov(int pocetZiakov){
        if (pocetZiakov >= 0){
            this.pocetZiakov = pocetZiakov;
        }
    }
    public void setOdborna(boolean odborna){
        this.odborna = odborna;
    }
    public void infoSkoly(){
        System.out.println("nazov skoly: " + getNazovSkoly());
        System.out.println("pocet ziakov: " + getPocetZiakov());
        if (odborna){
            System.out.println("je odborna");
        }else System.out.println("nie je odborna");
    }
}
