package zooAnimales;
import java.util.ArrayList; 
import gestion.Zona;
import gestion.Zoologico;

public class Ave extends Animal{
    ArrayList<Object> Ave = new ArrayList<>();
    int halcones;
    int aguilas;
    String colorPlumas;
    Zona habitat;
    Zona montanas = new Zona("montanas", null);

    public Ave(String colorPlumas, Zona zona){
        this.colorPlumas = colorPlumas;
        this.habitat = zona;
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
    	new Ave("cafe glorioso", montanas);
    	halcones += 1;
    }
    public void crearAguila(){
    	new Ave("blanco y amarillo", montanas);
        aguilas += 1;

    }
    
}
