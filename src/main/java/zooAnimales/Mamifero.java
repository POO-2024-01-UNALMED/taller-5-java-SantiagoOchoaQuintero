package zooAnimales;
import gestion.Zoologico;
import gestion.Zona;
import java.util.ArrayList; 

public class Mamifero extends Animal{
    ArrayList<Object> Mamifero =  new ArrayList<>();
    public static int caballos;
    public static int leones;
    boolean pelaje;
    int patas;
    Zona habitat;

    static Zona pradera = new Zona("pradera", null);
    static Zona selva = new Zona("selva", null);

    public Mamifero (String nombre, int edad, String genero, boolean pelaje, int patas, Zona habitat){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.pelaje = pelaje;
        this.patas = patas;
        this.habitat = habitat;

        Mamifero.add(this);
    }
    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        caballos += 1;
    	return new Mamifero(nombre,edad,genero,true,4,pradera);
        
    }
    public Mamifero crearLeon(String nombre, int edad, String genero){
        leones += 1;
        return new Mamifero(nombre,edad,genero,pelaje,patas, habitat);
        
    }
    
    public int cantidadMamiferos(){
        return caballos + leones;
    }

    

    
}
