package gestion;
import java.util.ArrayList; 
import zooAnimales.*;

public class Zoologico{
    String nombre;
    String ubicacion;
    ArrayList<Object> Zonas;
    static int cantidadTotal;

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.Zonas = new ArrayList<Object>();
        this.cantidadTotal = 0;
    }

    public Zoologico(){
        this.nombre = "";
        this.ubicacion = "";
        this.Zonas = new ArrayList<Object>();
        this.cantidadTotal = 0;
    }

    public void agregarZonas(Zona zona){
        Zonas.add(zona);
    }

    public int cantidadTotalAnimales(){
        for (Object zona : Zonas) {
            cantidadTotal = cantidadTotal + ((Zona) zona).cantidadAnimales();
        }
        return cantidadTotal;
    }

    public ArrayList getZona(){
        return this.Zonas;
    }
    public int cantidadAnimales() {
    	return 0;
    }

    public String getNombre(){
        return this.nombre;
    }
}