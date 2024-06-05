package Models.Models;

import java.util.*;
import Models.Models.*;

public class CD extends Obra {
    private int Nocd;
    private Cancion canciones;
    private Coleccion coleccion;
    private Artista artistaz;
    
    public CD(){
    }
    
    public CD(String Clave, int Nocd, String titulo, Float Precio, Compañia compañiass, 
            Coleccion coleccion, Cancion Cancion,Artista artistax) {
        this.Clave = Clave;
        this.Nocd = Nocd;
        this.Titulo = titulo;
        this.Precio = Precio;
        this.canciones = Cancion;
        
        this.coleccion = coleccion;
        this.artistaz = artistax;
    }

    public Artista getArtistaz() {
        return artistaz;
    }

    public void setArtistaz(Artista artistaz) {
        this.artistaz = artistaz;
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

    public Cancion getCanciones() {
        return canciones;
    }

    public void setCanciones(Cancion canciones) {
        this.canciones = canciones;
    }

   

   

    
    /*Generar estructura */
    @Override
    public String toString() {
        String datos;
        datos = "\n"+"CD: "+Titulo+" || ";
        datos += "Numero de CD "+Nocd+" ||";
        datos +="Canciones  "+ canciones+" || ";
        datos +="Artista " +artistaz+" || ";
        datos +="Compañia "+compañias+"\n";
        return datos;
    }

 

    

    
    
}
