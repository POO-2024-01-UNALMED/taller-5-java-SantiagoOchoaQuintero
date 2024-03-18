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
        this.Animales = new ArrayList<Object>();
        this.nombre = null;
        this.zoo = null;
    }

    public int cantidadAnimales() {
    	this.Animales.size();
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
