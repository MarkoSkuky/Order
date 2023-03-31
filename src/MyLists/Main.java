package MyLists;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Clovek> myArrayList = new MyArrayList<>(10);
//        myArrayList.add(5);
//        myArrayList.add(7);
//        myArrayList.add(9);
//        myArrayList.add(5);
//        myArrayList.add(11);System.out.println(myArrayList.get(2));
////        myArrayList.remove(6);
////
////        System.out.println(myArrayList.get(2));
////        System.out.println(myArrayList.get(3));
////        System.out.println(myArrayList.get(4));
//        myArrayList.add(20);

        myArrayList.add(new Clovek("marko", 12));
        myArrayList.add(new Clovek("jano", 22));
        myArrayList.add(new Clovek("ivo", 78));

        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(1));



//
    }
}
