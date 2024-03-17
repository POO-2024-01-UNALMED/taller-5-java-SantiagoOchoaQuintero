package zooAnimales;
import java.util.ArrayList; 
import gestion.*;

public class Pez extends Animal{
    ArrayList<String> Pez = new ArrayList<>();
    int salmones;
    int bacalaos;
    String colorEscamas;
    int cantidadAletas;
    Zona habitat;

    Zona oceano = new Zona("oceano",null);

    public Pez(String colorEscamas, int cantidadAletas, Zona habitat){
        this.colorEscamas = colorEscamas;
        this.habitat = habitat;
        this.cantidadAletas = cantidadAletas;

        Pez.add(this);
    } 

    public Pez(){
        this("",0,null);
        Pez.add(this);
        
    }

    public int cantidadPeces(){
        return salmones + bacalaos;
    }

    public String movimiento(){
        return "nadar";
    }

    public void crearSalmon(){
        new Pez("rojo",6,oceano);
        salmones += 1;
    }

    public void crearBacalao(){
        new Pez("gris",6,oceano);
        bacalaos += 1;
    }
}