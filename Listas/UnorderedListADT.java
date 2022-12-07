package Listas;

public interface UnorderedListADT<T> {

    public void addToFront(T element);

    public void addToRear(T element);

    public void addAfter(T element, T target);
    
    
}
