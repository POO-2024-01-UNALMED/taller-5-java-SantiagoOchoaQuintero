package zooAnimales;
import java.util.ArrayList; 
import gestion.*;

public class Anfibio extends Animal{
    ArrayList<Object> Anfibio = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    String colorPiel;
    Boolean venenoso;
    String habitat;
    static Zona selva =  new Zona("Selva", null);

    public Anfibio(){
        Anfibio.add(this);
    }
    public Anfibio(String nombre, int edad, String habitat,String genero, String colorPiel, boolean venenoso ){
        this.nombre=nombre;
        this.edad=edad;
        this.genero= genero;
        this.habitat = habitat;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public Anfibio(String nombre, int edad,String genero,String colorPiel, Boolean venenoso, String habitat){
        this.nombre=nombre;
        this.edad=edad;
        this.genero= genero;
        this.habitat = habitat;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        Anfibio.add(this);
    }
    public static Anfibio crearRana(String nombre,int edad ,String genero){
        ranas += 1;
        return new Anfibio(nombre, edad, genero,"rojo",true,"selva");
        
    }

    public static Anfibio crearSalamandra(String nombre,int edad ,String genero){
        salamandras += 1;
        return new Anfibio(nombre, edad, genero,"rojo",true,"selva");
    }
    public int cantidadAnfibios(){
        return ranas + salamandras;
    }
    public String movimiento(){
        return "saltar";
    }
    public int totalPorTipo(){
        return ranas + salamandras;
    }
    public String getColorPiel(){
        return this.colorPiel;
    }
    public Boolean isVenenoso(){
        return this.venenoso;
    }
// public void crearRana(){
    //     new Anfibio("rojo",true,"selva");
    //     ranas += 1;
    // }

    // public void crearSalamandra(){
    //     new Anfibio("negro y amarillo",false, "selva");
    //     salamandras += 1;
    // }
}
