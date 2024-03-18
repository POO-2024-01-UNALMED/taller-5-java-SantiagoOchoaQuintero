package zooAnimales;
import java.util.ArrayList; 
import gestion.Zona;


public class Ave extends Animal{
    static ArrayList<Ave> Aves = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    String colorPlumas;
    String habitat;
    static Zona montanas = new Zona("montanas",null);

    public Ave(){
       this(null,0,null,null,null);
       Aves.add(this);
    }
   

    public Ave(String nombre, int edad, String habitat,String genero, String colorPlumas){
        super(nombre,edad,habitat,genero);
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.colorPlumas = colorPlumas;
        this.habitat = habitat;
        Aves.add(this);
    }
    public static Ave crearHalcon(String nombre, int edad, String genero){
        halcones += 1;
        return new Ave(nombre, edad, genero,"cafe glorioso", "montanas"); 
        }
        public static Ave crearAguila(String nombre, int edad, String genero){
            aguilas += 1;
            return new Ave(nombre, edad, "montanas",genero, "blanco y amarillo");
        }
    public static int cantidadAves(){
        return Ave.Aves.size();
    }
    public String movimiento(){
		return "volar";
    }
   
    public String getColorPlumas(){
        return this.colorPlumas;
    }
    public String getGenero(){
        return this.genero;
    }
    public String getHabitat(){
        return this.habitat;
    }
    public static ArrayList<Ave> getLista(){
        return Aves;
    }
    
}
