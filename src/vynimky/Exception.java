package vynimky;

public class Exception {
    public static void main(String[] args) {
        int[] pole = new int[10];
        try {
            System.out.println(pole[10]);
            System.out.println("dsfsff");
        }catch (java.lang.Exception e){
            System.out.println("error");
        }
        System.out.println("pokracujeme dalej");
    }
}
