package zooAnimales;
import gestion.Zona;
import java.util.ArrayList; 

public class Mamifero extends Animal{
    static ArrayList<Mamifero> Mamiferos =  new ArrayList<>();
    public static int caballos;
    public static int leones;
    boolean pelaje;
    int patas;
    String habitat;

    static Zona pradera = new Zona("pradera", null);
    static Zona selva = new Zona("selva", null);

    public Mamifero (String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        super(nombre,edad,habitat,genero);
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.pelaje = pelaje;
        this.patas = patas;
        this.habitat = habitat;
        Mamifero.Mamiferos.add(this);
    }
    public Mamifero(){
        this(null,0,null,null,false,0);
    }
    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        Mamifero mamifero = new Mamifero(nombre,edad,"pradera",genero,true,4);
        caballos += 1;
    	return mamifero;
        
    }
    public static Mamifero crearLeon(String nombre, int edad, String genero){
        Mamifero mamifero = new Mamifero(nombre,edad,"selva",genero,true,4);
        leones += 1;
        return mamifero;
        
    }
    
    public static int cantidadMamiferos(){
        return Mamifero.Mamiferos.size();
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
        return Mamiferos;
    }
}