package zooAnimales;
import gestion.Zona;
import gestion.Zoologico;   
import java.util.ArrayList; 

public class Reptil extends Animal{
    static ArrayList<Object> Reptil = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    String colorEscamas;
    int largoCola;
    String habitat;

    public Reptil(){
        Reptil.add(this);
    }
    
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero; 
        this.habitat = habitat;
        this.largoCola = largoCola;
        this.colorEscamas = colorEscamas;

        Reptil.add(this);
    }
    public static Reptil crearIguana(String nombre, int edad, String genero){
        iguanas += 1;
        return new Reptil(nombre , edad, "humedal", genero,"verde", 3);
    }
    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        serpientes += 1;
        return new Reptil(nombre , edad,"humedal", genero, "blanco", 1);
    }
    public int cantidadReptiles(){
        return serpientes + iguanas;
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


}
