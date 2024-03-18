package gestion;
import java.util.ArrayList; 
import zooAnimales.*;

public class Zoologico{
    String nombre;
    String ubicacion;
    static ArrayList<Zona> Zonas = new ArrayList<Zona>();
    static int cantidadTotal;

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cantidadTotal = 0;
    }

    public Zoologico(){
        this(null,null);
    }

    public void agregarZonas(Zona zona){
        this.Zonas.add(zona);
    }

    public int cantidadTotalAnimales() {
		int totalAnimales=0;
		for (Zona zonas : Zonas) {
			totalAnimales+=zonas.cantidadAnimales();
				
		}
		return totalAnimales;
	}

    public ArrayList<Zona> getZona(){
        return Zonas;
    }
 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setUbicacion(String nombre){
        this.ubicacion = nombre;
    }
    public String getUbicacion(){
        return this.ubicacion;
    }
}