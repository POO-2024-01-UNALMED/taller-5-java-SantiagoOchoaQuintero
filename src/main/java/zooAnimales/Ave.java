package zooAnimales;
import java.util.ArrayList; 
import gestion.Zona;
import gestion.Zoologico;

public class Ave extends Animal{
    static ArrayList<Object> Ave = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    String colorPlumas;
    String habitat;
    static Zona montanas = new Zona("montanas",null);

    public Ave(){
        Ave.add(this);
    }
   

    public Ave(String nombre, int edad, String habitat,String genero, String colorPlumas){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.colorPlumas = colorPlumas;
        this.habitat = habitat;
        Ave.add(this);
    }
    public static Ave crearHalcon(String nombre, int edad, String genero){
        halcones += 1;
        return new Ave(nombre, edad, genero,"cafe glorioso", "montanas"); 
        }
        public static Ave crearAguila(String nombre, int edad, String genero){
            aguilas += 1;
            return new Ave(nombre, edad, "montanas",genero, "blanco y amarillo");
        }
    public int cantidadAves(){
        return halcones + aguilas;
    }
    public String movimiento(){
		return "volar";
    }
   
    public String getColorPlumas(){
        return this.colorPlumas;
    }
}
