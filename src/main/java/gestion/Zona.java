package gestion;
import java.util.ArrayList;
import gestion.Zoologico;
import zooAnimales.Animal; 


public class Zona{
    String nombre;
    Zoologico zoo;
    ArrayList<Animal> Animales = new ArrayList<>();

    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public Zona(){
    	this(null,null);
    }
	public  ArrayList<Animal> getAnimales() {
		return Animales;
	}
    public int cantidadAnimales() {
    	int cantidadAnimales = Animales.size();
    	return cantidadAnimales;
    }
    public void setAnimales(ArrayList<Animal> animales) {
		this.Animales=animales;
	}
    public void agregarAnimales(Animal animal){
        this.Animales.add(animal);
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
       return this.nombre;
    }
    public void setZoo(Zoologico zoo){
        this.zoo = zoo;
    }
    public Zoologico getZoo(){
        return this.zoo;
    }
}
