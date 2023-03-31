package MyLists;

public class MyArrayList<T> extends MyAbstractList<T> {
    private Object[] data;

    public MyArrayList() {
        data = new Object[10];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Kapacita mensia ako 0");
        }
        data = new Object[initialCapacity];
    }

    private  T getElement(int index) {
        return (T) data[index];
    }

    // Metoda add uklada element na koniec arraylistu
    @Override
    void add(T element) {
        /*
       1. Ak je pole plne, cize size == velkosti pola,
          vytvorime nove vacsie pole
            prvky z pola data ulozime do nove pole
            nove pole nastavime ako pole data
       2. element ulozime do pola data poziciu size
       3. navysime size o 1
         */
        if(size == data.length) {
            Object[] newData = new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
        }
        data[size] = element;
        size++;
    }

    @Override
    void add(int index, T element) {
        for (int i = size; i > index; i--) {
        }

    }

    @Override
    T get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index];
    }

    void check(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();

        }

    }

    @Override
    T remove(int index) {
        check(index);
        Object object = data[index];

            data[index] = null;
            for (int i = index; i < size-1; i++) {
                data[i] = data[i+1];
            }

        return (T) object;
    }

    @Override
     boolean remove(T element) {
        for (int i = 0; i < size-1; i++) {
            if (data[i] == element) {
                remove(i);
                return  true;
            }
        }
        return false;
    }

}
