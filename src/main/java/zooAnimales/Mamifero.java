package zooAnimales;
import gestion.Zoologico;
import gestion.Zona;
import java.util.ArrayList; 

public class Mamifero extends Animal{
    static ArrayList<Mamifero> Mamifero =  new ArrayList<>();
    public static int caballos;
    public static int leones;
    boolean pelaje;
    int patas;
    String habitat;

    static Zona pradera = new Zona("pradera", null);
    static Zona selva = new Zona("selva", null);

    public Mamifero (String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.pelaje = pelaje;
        this.patas = patas;
        this.habitat = habitat;
        Mamifero.add(this);
    }
    public Mamifero(){
        Mamifero.add(this);
    }
    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        caballos += 1;
    	return new Mamifero(nombre,edad,"pradera",genero,true,4);
        
    }
    public static Mamifero crearLeon(String nombre, int edad, String genero){
        leones += 1;
        return new Mamifero(nombre,edad,"selva",genero,true,4);
        
    }
    
    public int cantidadMamiferos(){
        return caballos + leones;
    }

    public boolean isPelaje(){
        return this.pelaje;
    }

    public int getPatas(){
        return this.patas;
    }
    public String getGenero(){
        return this.genero;
    }
    public String getHabitat(){
        return this.habitat;
    }
    public static ArrayList<Mamifero> getLista(){
        return Mamifero;
    }
}