package MyLists;

public abstract class MyAbstractList<T> {
    protected int size = 0;
    abstract void add(T element);
    abstract void add(int index, T element);
    abstract T get(int index);
    abstract T remove(int index);
    abstract boolean remove(T element);

    public int size() {
        return size;
    }
}
