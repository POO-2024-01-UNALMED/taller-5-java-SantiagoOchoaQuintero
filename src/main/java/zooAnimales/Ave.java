package zooAnimales;
import java.util.ArrayList; 
import gestion.Zona;
import gestion.Zoologico;

public class Ave extends Animal{
    ArrayList<Object> Ave = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    String colorPlumas;
    Zona habitat;
    static Zona montanas = new Zona("montanas",null);


    public Ave(String nombre, int edad, String genero,String colorPlumas, Zona habitat){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.colorPlumas = colorPlumas;
        this.habitat = habitat;
        Ave.add(this);
    }
    public static Ave crearHalcon(String nombre, int edad, String genero){
        halcones += 1;
        return new Ave(nombre, edad, genero,"cafe glorioso", montanas); 
        }
        public static Ave crearAguila(String nombre, int edad, String genero){
            aguilas += 1;
            return new Ave(nombre, edad, genero,"blanco y amarillo", montanas);
        }
    public int cantidadAves(){
        return halcones + aguilas;
    }
    public String movimiento(){
		return "volar";
    }
   
    //     public void crearHalcon(){
    //     // 	new Ave("cafe glorioso", "montanas");
    //     // 	halcones += 1;
    //     // }
    //     // public void crearAguila(){
    //     // 	new Ave("blanco y amarillo", "montanas");
    //     //     aguilas += 1;

    //     // }
    // }
}
