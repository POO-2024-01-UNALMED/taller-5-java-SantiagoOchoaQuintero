package gestion;
import java.util.ArrayList;
import gestion.Zoologico;
import zooAnimales.Animal; 


public class Zona{
    String nombre;
    Zoologico zoo;
    ArrayList<Object> Animales;

    public Zona(String nombre, Zoologico zoo){
        this.Animales = new ArrayList<Object>();
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public Zona(){
    	return;
    }

    public int cantidadAnimales() {
    	return Animales.size();
    }
    public void agregarAnimales(Animal animal){
        this.Animales.add(animal);
    }

    public String getNombre(){
       return this.nombre;
    }
    public Zoologico getZoo(){
        return this.zoo;
    }
}
