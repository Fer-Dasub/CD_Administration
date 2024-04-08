package Models;
import Models.*;
import java.util.*;

public class Cancion {
    private String CancionNombre;
    private Float Duracion;
    private CD cd;
    public Cancion(String CancionNombre, Float Duracion, CD cd){
        this.CancionNombre = CancionNombre;
        this.Duracion = Duracion;
        this.cd = cd;
    }
    public Cancion(){

    }
    public String getCancionNombre() {
        return CancionNombre;
    }
    public void setCancionNombre(String cancionNombre) {
        CancionNombre = cancionNombre;
    }
    public Float getDuracion() {
        return Duracion;
    }
    public void setDuracion(Float duracion) {
        Duracion = duracion;
    }
    public CD getCd() {
        return cd;
    }
    public void setCd(CD cd) {
        this.cd = cd;
    }
    
    @Override
    public String toString(){
        String datos = "- "+CancionNombre+" -- "+Duracion;
        return datos;
    }
}