package Models.Models;

import java.util.HashMap;
import java.util.Map;


public class Artista {
    protected String Nombre;
    protected String Nacionalidad;
    protected String GeneroDeMusica;
    private Map<String, CD> cd;
    

    public Artista(String Nombre, String Nacionalidad, String GeneroDeMusica, Map<String, CD> cds){
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.GeneroDeMusica = GeneroDeMusica;
        this.cd = cds;
    }
    public Artista(){

    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getNacionalidad() {
        return Nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }
    public String getGeneroDeMusica() {
        return GeneroDeMusica;
    }
    public void setGeneroDeMusica(String generoDeMusica) {
        GeneroDeMusica = generoDeMusica;
    }

    public Map<String, CD> getCd() {
        return cd;
    }

    public void setCd(Map<String, CD> cd) {
        this.cd = cd;
    }
    
    @Override
    public String toString(){
        String datos = "||Artista: "+Nombre+" ||Nacionalidad: "+Nacionalidad+" ||Genero musical: "+GeneroDeMusica+" ||";
        return datos;
    }
}
