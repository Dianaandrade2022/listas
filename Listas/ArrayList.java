package Listas;

import java.util.NoSuchElementException;

public class ArrayList<T> implements ListADT<T> {

    protected final int NOT_FOUND = -1;
    protected int rear;
    protected T[] list;
    private final int DEFAULT_CAPACITY = 50;

    public ArrayList() {
        rear = 0;
        list = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public T removeFirst() {
        return remove(list[0]);
    }

    public T removeLast() {
        return remove(list[rear - 1]);
    }

    public T remove(T element) {
        T result;
        int index = find(element);
        if (index == NOT_FOUND) {
            throw new NoSuchElementException("list");
        }
        result = list[index];
        rear--;
        for (int scan = index; scan < rear; scan++) {
            list[scan] = list[scan + 1];    
        }
        list[rear] = null;
        return result;
    }

    private int find(T element) {
        int scan = 0, result = NOT_FOUND;
        boolean found = false;

        if (!isEmpty()) {

            while (!found && scan < rear) {
                if (element.equals(list[scan])) {
                    found = true;
                } else {
                    scan++;
                }
            }

        }
        if (found) {
            result = scan;
        }
        return result;
    }

    public T first() {
        // Actividad:Retornar el primer elemento de la lista
        return(list[0]);
    }

    public T last() {
        return list[rear - 1];
    }

    public boolean contains(T target) {
        int scan = 0, result = NOT_FOUND;
        boolean found = false;
        if (!isEmpty()) {
            while (!found && scan < rear) {
                if (target.equals(list[scan])){
                    found = true;
                } else {
                    scan++;
                }
            }

        }
        return found;
    }

    public boolean isEmpty() {
        if (size() == list.length){
            return true;
        }else{
          return false;
        }
    }

    public int size() {
        return rear;
    }


    public String toString() {
        String lista = "";
        for (int i = 0; i < rear; i++) {
            lista = lista + list[i] + "|";
        }
        return lista;
    }

    public Iterator<T> itereator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

   
    public ListADT<T> union(ListADT<T> set) {
        // TODO Auto-generated method stub
        return null;
    }

}
