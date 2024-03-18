package zooAnimales;
import gestion.Zona;
import gestion.Zoologico;   
import java.util.ArrayList; 

public class Reptil extends Animal{
    ArrayList<Object> Reptil = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    String colorEscamas;
    int largoCola;
    Zona habitat;

    static Zona humedal = new Zona("humedal", null);

    
    public Reptil(String nombre, int edad, String genero, String colorEscamas, int largoCola, Zona habitat){
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
        return new Reptil(nombre , edad, genero, "verde", 3, humedal);
    }
    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        serpientes += 1;
        return new Reptil(nombre , edad, genero, "blanco", 1, humedal);
    }
    public int cantidadReptiles(){
        return serpientes + iguanas;
    }
    public String movimiento(){
        return "reptar";
    }

}
