package Models;
import Models.*;
import java.util.*;

public class Coleccion {
    private String Promotor;
    private List<CD> cd;
    public Coleccion(String Promotor){
        this.Promotor = Promotor;
    }
    public Coleccion(){
        this.cd = new ArrayList<>();
    }
    public String getPromotor() {
        return Promotor;
    }
    public void setPromotor(String promotor) {
        Promotor = promotor;
    }
    public List<CD> getCd() {
        return cd;
    }
    public void setCd(List<CD> cd) {
        this.cd = cd;
    }
    public void addCd(CD cds){
        this.cd = new ArrayList<>();
        cd.add(cds);
    }
    public void removeCd(CD cds){
        cd.remove(cds);
    }
    
}
