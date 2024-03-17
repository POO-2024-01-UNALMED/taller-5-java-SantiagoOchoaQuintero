package zooAnimales;
import java.util.ArrayList; 
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
    int totalPeces = 0;
    
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
//    public totalPorTipo(){
//    	
//    }
//    
    public void sumarAnimales(String tipo){
        totalAnimales += 1;
        switch (tipo) {
            case "pez":
                totalPeces += 1;
            break;
            default:
                break;
        }
    }


    @Override
    public String toString(){
        return "Mi nombre es"+this.nombre+", tengo una edad de "+this.edad+", habito en"+this.habitat+"y mi genero es"+this.genero+", la zona en la que me ubico es"+this.zona+"en el "+this.zoo;
    }
}
