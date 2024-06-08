package Models.Models;

import java.util.*;
import Models.Models.Crud.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import Models.Models.*;

public class Cancion extends Obra {

    /*private String CancionNombre;*/
    private Float Duracion;
    private CD cd;
    private Artista artista;
    List<String> art = new ArrayList<>();

    public Cancion() {

    }

    public Cancion(String CancionNombre, Float Duracion, CD cd, Map<String, Cancion> Cancion, Artista artistas) {
        /*this.CancionNombre = CancionNombre;*/
        this.Titulo = CancionNombre;
        this.Duracion = Duracion;
        this.cd = cd;
        this.artista = artistas;
    }

    public Float getDuracion() {
        return Duracion;
    }

    public void setDuracion(Float Duracion) {
        this.Duracion = Duracion;
    }

    public CD getCd() {
        return cd;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public List<String> getArt() {
        return art;
    }

    public void setArt(List<String> art) {
        this.art = art;
    }

  

    public List<String> getlistacd(){
        CancionCrud DatosCanciones = new CancionCrud();
        
        try {
            art = DatosCanciones.ListaNombreCanciones();
        } catch (Exception ex) {
            Logger.getLogger(Cancion.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Canciones= "+art);
        return art;
    }
    
    
    @Override
    public String toString() {
        
       
        String datos ="\n"+"Cancion: " + Titulo + " -- ";
         datos += artista;
       
       
        return datos;
        
    }
}
