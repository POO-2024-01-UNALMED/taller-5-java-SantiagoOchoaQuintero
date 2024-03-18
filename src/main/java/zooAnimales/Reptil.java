package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
    static ArrayList<Reptil> Reptiles = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    String colorEscamas;
    int largoCola;
    String habitat;

    public Reptil(){
        this(null,0,null,null,null,0);
        Reptiles.add(this);
    }
    
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre,edad,habitat,genero);
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero; 
        this.habitat = habitat;
        this.largoCola = largoCola;
        this.colorEscamas = colorEscamas;
        Reptiles.add(this);
    }
    public static Reptil crearIguana(String nombre, int edad, String genero){
        iguanas += 1;
        return new Reptil(nombre , edad, "humedal", genero,"verde", 3);
    }
    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        serpientes += 1;
        return new Reptil(nombre , edad,"humedal", genero, "blanco", 1);
    }
    public static int cantidadReptiles(){
        return Reptil.Reptiles.size();
    }
    public String movimiento(){
        return "reptar";
    }
    public String getColorEscamas(){
        return this.colorEscamas;
    }   
    public int getLargoCola(){
        return this.largoCola;
    }
    public String getHabitat(){
        return this.habitat;
    }
    public static ArrayList<Reptil> getLista(){
        return Reptiles;
    }

}

