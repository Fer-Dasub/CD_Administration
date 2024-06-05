package Models.Models;

import java.util.*;

public class Cancion extends Obra {

    /*private String CancionNombre;*/
    private Float Duracion;
    private CD cd;
    private Map<String, Artista> artista;

    public Cancion() {

    }

    public Cancion(String CancionNombre, Float Duracion, CD cd, Map<String, Cancion> Cancion, Map<String, Artista> artistas) {
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

    public Map<String, Artista> getArtista() {
        return artista;
    }

    public void setArtista(Map<String, Artista> artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        String datos = "\n"+"Cancion: " + Titulo + " -- ";
        datos += " ||Artista " + artista;
        datos += " ||Clave "+ Clave;
        datos += " || Precio "+ Precio;
        /*datos +=" ||CD "+cd.getClave();*/
        datos +=" ||Compañia "+compañias+"\n";
        return datos;
    }
}
