package Models;
import java.util.*;


public class Compañia {
    private String CompañiaNombre;
    private String Direccion;
    private String PaisOrigen;
    private List<Obra> ObrasList;

    public Compañia(){
        this.ObrasList = new ArrayList<>();
        
    }
    

    public Compañia(String CompañiaNombre, String Direccion, String PaisOrigen){
        this.CompañiaNombre = CompañiaNombre;
        this.Direccion = Direccion;
        this.PaisOrigen = PaisOrigen;

    }
    /*Generar get y set */
    
    public String getCompañiaNombre() {
        return CompañiaNombre;
    }


    public void setCompañiaNombre(String compañiaNombre) {
        CompañiaNombre = compañiaNombre;
    }


    public String getDireccion() {
        return Direccion;
    }


    public void setDireccion(String direccion) {
        Direccion = direccion;
    }


    public String getPaisOrigen() {
        return PaisOrigen;
    }


    public void setPaisOrigen(String paisOrigen) {
        PaisOrigen = paisOrigen;
    }


    public List<Obra> getObrasList() {
        return ObrasList;
    }

    public void addObrasList(Obra obra){
        this.ObrasList = new ArrayList<>();
        ObrasList.add(obra);
    }

    public void removeObrasList(Obra obra){
        ObrasList.remove(obra);
    }

    public void setObrasList(List<Obra> obrasList) {
        ObrasList = obrasList;
    }
    
    



    /*Generar la estructura para mostrar los datos */
    @Override
    public String toString(){
        String datos = "||Nombre: "+CompañiaNombre+" ||Direccion: "+Direccion+" ||Pais: "+PaisOrigen+"||";
        return datos;
    }
}

  