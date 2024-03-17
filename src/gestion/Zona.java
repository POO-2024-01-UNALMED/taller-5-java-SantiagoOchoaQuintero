package gestion;
import java.util.ArrayList;

import zooAnimales.Animal; 


public class Zona {
    String nombre;
    Zoologico zoo;
    ArrayList<String> Animales;

    public Zona(String nombre, Zoologico zoo){
        this.Animales = new ArrayList<>();
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public Zona(){
        this.Animales = new ArrayList<>();
        this.nombre = null;
        this.zoo = null;
    }

    public void agregarAnimales(Animal animal){
        this.Animales.add(animal);
    }

    public int cantidadAnimales(){
        return this.Animales.size();
    }
}

