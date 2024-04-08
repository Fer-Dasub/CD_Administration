package Models;

import java.util.*;

public class CD extends Obra {
    private int Nocd;
    private Map<String, Cancion> canciones;
    private Coleccion coleccion;
    private Map<String, Artista> artista;

    public CD(String Clave, int Nocd, String Titulo, Float Precio, String compañias, 
            Coleccion coleccion) {      
    }
  
    /*Set y Get */

    public int getNocd() {
        return Nocd;
    }

    public void setNocd(int nocd) {
        Nocd = nocd;
    }

    public Coleccion getColeccion() {
        return coleccion;
    }

    public void setColeccion(Coleccion coleccion) {
        this.coleccion = coleccion;
    }

   

    public Map<String, Artista> getArtistas() {
        return artista;
    }

    public void setArtistas(Map<String, Artista> artista) {
        this.artista = artista;
    }

    public Map<String, Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(Map<String, Cancion> canciones) {
        this.canciones = canciones;
    }
    /*Generar estructura */
    @Override
    public String toString() {
        String datos;
        datos = "Nombre del CD "+Titulo+" || ";
        datos += "Canciones || "+ canciones+" || ";
        datos +=  "Artista " +artista+" || Compañia "+compañias+"\n";
        return datos;
    }

    

    
    
}
