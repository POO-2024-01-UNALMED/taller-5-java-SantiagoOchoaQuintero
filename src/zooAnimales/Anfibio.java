package zooAnimales;
import java.util.ArrayList; 
import gestion.*;

public class Anfibio {
    ArrayList<String> Anfibio = new ArrayList<>();
    int ranas;
    int salamandras;
    String colorPiel;
    Boolean venenoso;
    Zona habitat;

    Zona selva = new Zona("selva", null);
    public Rana(Strign colorPiel, Boolean venenoso, Zona habitat){
        this.habitat = habitat;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;

        Anfibio.add(this);
    }


    public cantidadAnfibios(){
        return ranas + salamandras;
    }
    public String movimiento(){
        System.out.println("saltar");
    }
    public totalPorTipo(){
        return ranas + salamandras;
    }

    public crearRana(){
        new Anfibio("rojo",true,selva);
        ranas += 1;
    }

    public crearSalamandra(){
        new Anfibio("negro y amarillo",false, selva);
        salamandras += 1;
    }


}
