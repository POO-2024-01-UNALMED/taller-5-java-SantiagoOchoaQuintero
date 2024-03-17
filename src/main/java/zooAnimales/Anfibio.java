package zooAnimales;
import java.util.ArrayList; 
import gestion.*;

public class Anfibio {
    ArrayList<Object> Anfibio = new ArrayList<>();
    public int ranas;
    public int salamandras;
    String colorPiel;
    Boolean venenoso;
    String habitat;


    public Anfibio(String colorPiel, Boolean venenoso, String habitat){
        this.habitat = habitat;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;

        Anfibio.add(this);
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

    public void crearRana(){
        new Anfibio("rojo",true,"selva");
        ranas += 1;
    }

    public void crearSalamandra(){
        new Anfibio("negro y amarillo",false, "selva");
        salamandras += 1;
    }
    public void crearRana(String colorPiel,Boolean venenoso ,String habitat){
        new Anfibio(colorPiel, venenoso, habitat);
        ranas += 1;
    }

    public void crearSalamandra(String colorPiel,Boolean venenoso ,String habitat){
        new Anfibio(colorPiel, venenoso, habitat);
        salamandras += 1;
    }


}
