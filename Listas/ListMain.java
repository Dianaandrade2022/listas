package Listas;

public class ListMain {
    public static void main(String[] args) throws Exception {
        
        ArrayUnorderList<Integer> lista = new ArrayUnorderList<>(); 
        
        lista.add(10);
        lista.add(5);
        lista.add(6);
        lista.add(1);
        lista.add(9);
        lista.add(2);
        lista.add(3);
        lista.add(9);
        lista.add(12);

        System.out.println("lista ordenada ->" + lista);
        
        System.out.println("remueve el ultimo -> " + lista.removeLast());
        System.out.println("remueve el primero -> " + lista.removeFirst());

        System.out.println("lista ordenada ->" + lista);
        
        System.out.println("remueve el ultimo -> " + lista.removeLast());
        System.out.println("remueve el primero -> " + lista.removeFirst());

        System.out.println("lista ordenada ->" + lista);
    
    }
}
