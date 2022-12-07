package Listas;

public class ListMain extends ArrayList {
    public static void main(String[] args) throws Exception {
        
        ArrayUnorderList<Integer> lista = new ArrayUnorderList<>(); 
        
        lista.add(10);
        lista.add(1);
        lista.add(3);
        lista.add(2);
        lista.add(329);
        lista.add(18);
        lista.add(8);
        lista.add(4);
        lista.add(123);

        System.out.println("lista ordenada ->" + lista);
        
        System.out.println("remueve el ultimo -> " + lista.removeLast());
        System.out.println("remueve el primero -> " + lista.removeFirst());

        System.out.println("lista ordenada ->" + lista);
        
        System.out.println("remueve el ultimo -> " + lista.removeLast());
        System.out.println("remueve el primero -> " + lista.removeFirst());

        System.out.println("lista ordenada ->" + lista);
    
    }
}
