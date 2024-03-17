package gestion;
import java.util.ArrayList; 
import zooAnimales.*;

public class Zoologico{
    String nombre;
    String ubicacion;
    ArrayList<Object> Zonas;
    int cantidadTotal;

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.Zonas = new ArrayList<Object>();
        this.cantidadTotal = 0;
    }

    public void agregarZonas(Zona Zona){
        Zonas.add(Zona);
    }

    public int cantidadTotalAnimales(){
        for (Object zona : Zonas) {
            cantidadTotal = cantidadTotal + ((Zona) zona).cantidadAnimales();
          }
        return cantidadTotal;
    }

}