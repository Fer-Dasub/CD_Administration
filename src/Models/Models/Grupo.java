package Models.Models;


public class Grupo extends Artista{
    private int NoIntegrantes;
    private String IntegrantesNombres;

    public Grupo(String Nombre, String Nacionalidad, String GeneroDeMusica, int NoIntegrantes, String IntegrantesNombres){
        this.NoIntegrantes = NoIntegrantes;
        this.IntegrantesNombres = IntegrantesNombres;
        
    }
    public Grupo(){

    }
    public int getNoIntegrantes() {
        return NoIntegrantes;
    }
    public void setNoIntegrantes(int noIntegrantes) {
        NoIntegrantes = noIntegrantes;
    }
    public String getIntegrantesNombres() {
        return IntegrantesNombres;
    }
    public void setIntegrantesNombres(String integrantesNombres) {
        IntegrantesNombres = integrantesNombres;
    }
    
}
