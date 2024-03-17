package zooAnimales;
import gestion.Zoologico;
import gestion.Zona;
import java.util.ArrayList; 

public class Mamifero extends Animal{
    ArrayList<Object> Mamifero =  new ArrayList<>();
    int caballos;
    int leones;
    boolean pelaje;
    int patas;
    Zona pradera = new Zona("Pradera", null);
    Zona selva = new Zona("selva", null);

    public Mamifero (boolean pelaje, int patas, Zona habitat){
        this.pelaje = pelaje;
        this.patas = patas;
//        this.habitat = habitat;
    }
    public Mamifero(){
        this(false, 0, null);
        Mamifero.add(this);
    }
    public void crearCaballo(){
    	new Mamifero(true, 4, pradera);
        caballos += 1;
    }
    public void crearLeon(){
        new Mamifero(true, 4, selva);
        leones += 1;
    }
    
    public int cantidadMamiferos(){
        return caballos + leones;
    }

    

    
}
