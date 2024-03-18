package zooAnimales;
import gestion.Zona;

public class Animal {
    static int totalAnimales;
    String nombre;
    int edad;
    String habitat;
    String genero;
    Zona zona;
    
    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales += 1;

    }
    public Animal() {
    	this(null, 0, null, null);
    }


    public String movimiento(){
       return "desplazarse";
    }

    public static String totalPorTipo(){
        return "Mamiferos: "+(Mamifero.cantidadMamiferos()+1)+"\n"+ 
        "Aves: "+Ave.cantidadAves()+"\n"+ 
        "Reptiles: "+Reptil.cantidadReptiles()+"\n"+ 
        "Peces: "+Pez.cantidadPeces()+"\n"+
        "Anfibios: "+(Anfibio.cantidadAnfibios()+1);  
    }
    public void setTotalAnimales(int totalAnimales){
        Animal.totalAnimales = totalAnimales;
    }
    public int getTotalAnimales(){
        return totalAnimales;
    }

    public String getHabitat(){
        return this.habitat;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String habitat){
        this.genero = habitat;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String habitat){
        this.nombre = habitat;
    }
    public Zona getZona(){
        return this.zona;
    }
    public void setZona(Zona zona){
        this.zona = zona;
    }
    @Override
    public String toString(){
        if (getZona()!=null) {
			return "Mi nombre es "+ getNombre()+", tengo una edad de " +getEdad()+ ", habito en "+getHabitat()+" y mi genero es "+getGenero()+", la zona en la que me ubico es "+getZona().getNombre()+", en el "+getZona().getZoo().getNombre();
		}
		else {
		    return "Mi nombre es "+ getNombre()+", tengo una edad de " +getEdad()+ ", habito en "+getHabitat()+" y mi genero es "+getGenero();
		}    }
}