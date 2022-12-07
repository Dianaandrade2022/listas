package Listas;
public class ArrayUnorderList<T> extends ArrayList<T> implements UnorderedListADT<T>{  

    public void addToFront(T element) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void add (T element){
        if (size() == list.length){
            expandCapacity();
        }
    

    Comparable<T> temp = (Comparable<T>) element;

    int scan = 0;

    while (scan < rear && temp.compareTo(list[scan]) > 0) {
            scan++;
    }
    
     for (int scan2 = rear; scan2 > scan; scan2--) {
            list[scan2] = list[scan2 - 1];
        }
        list[scan] = element;
        rear++;
    }

    private void expandCapacity(){
        T[] larger = (T[]) (new Object[list.length * 2]);
        for (int index = 0; index < list.length; index++){
            larger[index] = list[index];
        }
        list = larger;
    }
    @Override
    public void addToRear(T element) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void addAfter(T element, T target) {
        // TODO Auto-generated method stub
        
    }
}
