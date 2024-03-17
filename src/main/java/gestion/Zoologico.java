package gestion;
import java.util.ArrayList; 

public class Zoologico{
    String nombre;
    String ubicacion;
    ArrayList<String> Zonas;
    int cantidadTotal;

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.Zonas = new ArrayList<>();
        this.cantidadTotal = 0;
    }

    public void agregarZonas(Zona Zona){
        Zonas.add(Zona);
    }

    public int cantidadTotalAnimales(){
        for (int i = 0; i < Zonas.size(); i++) {
            cantidadTotal = cantidadTotal + Zonas[i].Animales.size();
          }
        return cantidadTotal;
    }

}