package zooAnimales;
import java.util.ArrayList; 
import gestion.Zona;
import gestion.Zoologico;

public class Ave extends Animal{
    ArrayList<Object> Ave = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    String colorPlumas;
    String habitat;

    public Ave(String colorPlumas, String zona){
        this.colorPlumas = colorPlumas;
        this.habitat = zona;
    }

    public Ave(String nombre, int edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public Ave(){
    	this("cafe",null);
        Ave.add(this);
    }
    public Ave(String nombre){
        this.colorPlumas = nombre;
        Ave.add(this);
    }

    public int cantidadAves(){
        return halcones + aguilas;
    }
    public String movimiento(){
		return "volar";
    }

    public void crearHalcon(){
    	new Ave("cafe glorioso", "montanas");
    	halcones += 1;
    }
    public void crearAguila(){
    	new Ave("blanco y amarillo", "montanas");
        aguilas += 1;

    }
    public static Ave crearHalcon(String nombre, int edad, String genero){
        halcones += 1;
    	return new Ave(nombre, edad, genero);
    	
    }
    public static Ave crearAguila(String nombre, int edad, String genero){
        aguilas += 1;
    	return new Ave(nombre, edad, genero);
    }
    
}
