package Listas;

public interface IndexListADT<T> {

    public void add(int index, T element);
    
    public void set(int index, T element);
    
    public void add(T element);
    
    public T get(int index);
    
    public int indexOf(T element);
    
    public T remove(int index);
    
}
