package gestion;
import java.util.ArrayList; 
import zooAnimales.*;

public class Zoologico{
    String nombre;
    String ubicacion;
    ArrayList<Zona> Zonas;
    static int cantidadTotal;

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.Zonas = new ArrayList<Zona>();
        this.cantidadTotal = 0;
    }

    public Zoologico(){
        this.Zonas = new ArrayList<Zona>();
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

    public ArrayList getZona(){
        return this.Zonas;
    }
 

    public String getNombre(){
        return this.nombre;
    }
}