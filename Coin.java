public class Coin{

    private final int HEADS=0; //HEADS=cara
    private final int TAILS=1; //TAILS=cruz
    private int face;

    public Coin(){
        flip();
    }
    //lanzar la moneda por primera vez
    public void flip(){
        int face;
        this.face=(int)(Math.random()*2);
    
    }

    //devolver con true en caso de cara
    public boolean isHeads(){
           return (face==HEADS); 
    }
    //Devolver el estado actual de la moneda en forma de cadena
    public String toString(){

    String faceName;
    if(face==HEADS){
            faceName="4a";
     
        }
    else{
        faceName="4b";
    }

    return faceName;
}

}