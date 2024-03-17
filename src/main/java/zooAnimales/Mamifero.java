package zooAnimales;
import gestion.Zoologico;
import gestion.Zona;
import java.util.ArrayList; 

public class Mamifero extends Animal{
    ArrayList<Object> Mamifero =  new ArrayList<>();
    public int caballos;
    public int leones;
    boolean pelaje;
    int patas;
    String habitat;

    public Mamifero (boolean pelaje, int patas, String habitat){
        this.pelaje = pelaje;
        this.patas = patas;
        this.habitat = habitat;
    }
    public Mamifero(String nombre, int edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    public Mamifero(){
        this(false, 0, null);
        Mamifero.add(this);
    }
    public void crearCaballo(){
    	new Mamifero(true, 4, "pradera");
        caballos += 1;
    }
    public void crearLeon(){
        new Mamifero(true, 4, "selva");
        leones += 1;
    }
    public Mamifero crearCaballo(Boolean pelaje, int patas, String habitat){
        caballos += 1;
    	return new Mamifero(pelaje,patas, habitat);
        
    }
    public Mamifero crearLeon(Boolean pelaje, int patas, String habitat){
        leones += 1;
        return new Mamifero(pelaje,patas, habitat);
        
    }

    public Mamifero crearLeon(String nombre, int edad, String genero){
        leones += 1;
        return new Mamifero(nombre, edad, genero);
        
    }
    public Mamifero crearCaballo(String nombre, int edad, String genero){
        caballos += 1;
        return new Mamifero(nombre, edad, genero);
        
    }
    
    public int cantidadMamiferos(){
        return caballos + leones;
    }

    

    
}
