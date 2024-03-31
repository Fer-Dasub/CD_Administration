package Models;

import Models.*;

import java.time.LocalDate;
import java.util.*;

public class CD extends Obra {
    private int Nocd;
    private List<Cancion> cancions;
    private Coleccion coleccion;
    private List<Artista> artista;

    public CD(String Clave, int Nocd, String Titulo, Float Precio, String compañias, 
            Coleccion coleccion,
            List<Cancion> cancion, List<Artista> artistas) {
                this.Nocd = Nocd;
                this.coleccion = coleccion;
                this.cancions = cancion;
                this.artista = artistas;
    }
    public CD(){
        this.artista = new ArrayList<>();
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

    public List<Artista> getArtista() {
        return artista;
    }

    public void addArtista(Artista artistas){
        this.artista = new ArrayList<>();
        artista.add(artistas);
    }

    public void setArtista(List<Artista> artista) {
        this.artista = artista;
    }
    public List<Cancion> getCancions() {
        return cancions;
    }
    public void setCancions(List<Cancion> cancions) {
        this.cancions = cancions;
    }

    public void addCancion(Cancion cancion) {
        this.cancions = new ArrayList<>();
        cancions.add(cancion);
    }

    public void removeCancion(Cancion cancion){
        cancions.remove(cancion);
    }
    
    @Override
    public String toString() {
        String datos = "**************************\n";
        datos += "          "+Titulo+"\n**************************\n";
        datos += "Canciones \n"+ cancions+"\n";
        datos +=  artista+"  "+compañias+"\n";
        return datos;
    }
    
}
