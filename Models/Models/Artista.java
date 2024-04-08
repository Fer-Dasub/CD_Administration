package Models;


public class Artista {
    protected String Nombre;
    protected String Nacionalidad;
    protected String GeneroDeMusica;
    private CD cd;
    public Artista(String Nombre, String Nacionalidad, String GeneroDeMusica, CD cd){
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.GeneroDeMusica = GeneroDeMusica;
        this.cd = cd;
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
    public CD getCd() {
        return cd;
    }
    public void setCd(CD cd) {
        this.cd = cd;
    }
    @Override
    public String toString(){
        String datos = "||Artista: "+Nombre+" ||Nacionalidad: "+Nacionalidad+" ||Genero musical: "+GeneroDeMusica+" ||";
        return datos;
    }
}
