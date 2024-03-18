package zooAnimales;
import java.util.ArrayList; 
import gestion.*;

public class Pez extends Animal{
    static ArrayList<Pez> Pez = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    String colorEscamas;
    int cantidadAletas;
    String habitat;

    public Pez(String nombre,int edad, String habitat,String genero,String colorEscamas,  int cantidadAletas){
        this.nombre = nombre;
        this.edad = edad;
        this.genero=genero;
        this.colorEscamas = colorEscamas;
        this.habitat = habitat;
        this.cantidadAletas = cantidadAletas;

        Pez.add(this);
    } 

    public Pez(){
        Pez.add(this);
        
    }
    public static Pez crearSalmon(String nombre, int edad, String genero){
        salmones += 1;
        return new Pez(nombre, edad, "oceano",genero,"rojo",6);
    }

    public static Pez crearBacalao(String nombre, int edad, String genero){
        bacalaos += 1;
        return new Pez(nombre, edad, "oceano",genero,"gris",6);
    }
    public String getColorEscamas(){
        return this.colorEscamas;
    }
    public int getCantidadAletas(){
        return this.cantidadAletas;
    }
    public int cantidadPeces(){
        return salmones + bacalaos;
    }

    public String movimiento(){
        return "nadar";
    }
    public String getGenero(){
        return this.genero;
    }
    public String getHabitat(){
        return this.habitat;
    }
    public static ArrayList<Pez> getLista(){
        return Pez;
    }
}