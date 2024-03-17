package zooAnimales;
import gestion.Zona;
import gestion.Zoologico;   
import java.util.ArrayList; 

public class Reptil {
    ArrayList<Object> Reptil = new ArrayList<>();
    int iguanas;
    int serpientes;
    String colorEscamas;
    int largoCola;
    String habitat;
    
    public Reptil(String colorEscamas, int largo, String habitat){
        this.colorEscamas = colorEscamas;
        this.largoCola = largo;
        this.habitat = habitat;
        Reptil.add(this);
    }
    public Reptil(){
        Reptil.add(this);
    }


    public int cantidadReptiles(){
        return serpientes + iguanas;
    }
    public String movimiento(){
        return "reptar";
    }

    public void crearIguana(){
        new Reptil("verde", 3, "humedal");
        iguanas += 1;
    }
    public void crearIguana(String color, int largoCola, String habitat){
        new Reptil(color, largoCola, habitat);
        iguanas += 1;
    }

    public void crearSerpiente(){
        new Reptil("blanco", 1, "jungla");
        serpientes += 1;
    }
    public void crearSerpiente(String color, int largoCola, String habitat){
        new Reptil(color, largoCola, habitat);
        serpientes += 1;
    }


}
