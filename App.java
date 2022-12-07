import Herencia.Dictionary;
import Interfaz.*;
//import Recursividad.*;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        
        //ToString
        /*
        Coin coin=new Coin();
        System.out.println(coin);

        //Variables primitivas
        int num1=3; 
        int num2=5;
        int num3=1;

        num1=num3;
        num2=num1;
        num1=10;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


        //Variables Objeto
        Numero n1=new Numero();
        n1.numero=3;

        Numero n2=new Numero();
        n2.numero=5;

        Numero n3=new Numero();
        n3.numero=1;

        n1=n3;
        n2=n1;
        n1.numero=10;

        System.out.println(n1.numero);
        System.out.println(n2.numero);
        System.out.println(n3.numero);


        //Estaticas
        Estaticas e=new Estaticas();
        //e.count=0;        
        e.count2=5;

        
        Estaticas.count2=5;
        System.out.println(Estaticas.count2);

        Estaticas e2=new Estaticas();
        e2.incrementarcount(5);
        System.out.println(Estaticas.count2);

        
        Estaticas.incrementarcount2(10);
        System.out.println(Estaticas.count2);


        //Interfaz
        Sumar s=new Sumar();
        s.sumar(5,8);
        System.out.println(s.resultado());

        //Herencia
        Dictionary d=new Dictionary(20, 500);
        d.info();
      

        //Recursividad
        Recursiva r=new Recursiva();
       
        System.out.println(r.sumar(10));
        System.out.println(r.factorial(9));
       
*/
        //Maze
        Maze m=new Maze();
        System.out.println(m);

        if (m.traverse(0, 0)){
            System.out.println("Solicionado");
        }else{
            System.out.println("Sin Solicionado");
        }
        
        System.out.println(m);

        
        //Tower Of Hanoi
        //TowerOfHanoi t=new TowerOfHanoi(3);
        //tower.solve();

    }
}
