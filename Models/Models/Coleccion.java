package Models;
import java.time.LocalDate;
import java.util.*;

public class Coleccion extends Obra{
    private String Promotor;
    private Map<String, CD> cd;
    public Coleccion(String Promotor,String clave, String titulo, Float precio, LocalDate fechaCreacion, Compañia compañias){
        this.Promotor = Promotor;
    }
  
    public String getPromotor() {
        return Promotor;
    }
    public void setPromotor(String promotor) {
        Promotor = promotor;
    }

    public Map<String, CD> getCd() {
        return cd;
    }

    public void setCd(Map<String, CD> cd) {
        this.cd = cd;
    }
   
    
}
