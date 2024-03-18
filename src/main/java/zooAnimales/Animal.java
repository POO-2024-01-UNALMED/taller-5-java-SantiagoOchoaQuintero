package zooAnimales;
import gestion.Zona;
import gestion.Zoologico;

public class Animal extends Zona{
    int totalAnimales;
    String nombre;
    int edad;
    String habitat;
    String genero;
    Zoologico zoo;
    Zona zona;
    // int totalPeces = 0;
    // int totalAves = 0;
    // int totalMamiferos = 0;
    // int totalAnfibios = 0;
    // int totalReptiles = 0;
    
    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales += 1;

    }

    public Animal(String nombre, String habitat, String genero, Zona zona, int Edad){
        this.nombre = nombre;
        this.habitat = habitat;
        this.genero = genero;
        this.zona  = zona;
        this.edad = Edad;

        totalAnimales += 1; 
    }
    
    public Animal() {
    	this("",null,"",null,0);
    }


    public String movimiento(){
       return "desplazarse";
    }
    public static String totalPorTipo(){
        return "Mamiferos: "+Mamifero.getLista().size()+"\n"+ 
        "Aves: "+Ave.getLista().size()+"\n"+ 
        "Reptiles "+Reptil.getLista().size()+"\n"+ 
        "Peces: "+Pez.getLista().size()+"\n"+
        "Anfibios: "+Anfibio.getLista().size();
        
    }

    public int cantidadAnimales() {
    	return 0;
    }
    public String getHabitat(){
        return this.habitat;
    }
    public String getGenero(){
        return this.genero;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public Zona getZona(){
        return this.zona;
    }
    @Override
    public String toString(){
        return "Mi nombre es "+getNombre()+", tengo una edad de "+getEdad()+", habito en "+getHabitat()+" y mi genero es "+getGenero();
    }
}