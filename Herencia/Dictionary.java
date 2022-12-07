package Herencia;

public class Dictionary extends Book{

    private int numDefs;

    public Dictionary (int numDefs, int numPages){
        super(numPages);
        this.numDefs=numDefs;
    }

    public void info(){
        System.out.println("Number of definitions:"+ numDefs);
        System.out.println("Numer Pages:"+ numPages);
        System.out.println("Numer Definitions/Pages:"+ numDefs+numPages);
    }
    
}
