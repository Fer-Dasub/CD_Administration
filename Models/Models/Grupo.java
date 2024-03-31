package Models;


public class Grupo {
    private int NoIntegrantes;
    private String IntegrantesNombres;

    public Grupo(int NoIntegrantes, String IntegrantesNombres){
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
