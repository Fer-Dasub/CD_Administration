package Models;

import java.util.*;

public class Compañia {
    private String CompañiaNombre;
    private String Direccion;
    private String PaisOrigen;
    private Map<String, Obra> obras;

    public Compañia() {

    }

    public Compañia(String CompañiaNombre, String Direccion, String PaisOrigen) {
        this.CompañiaNombre = CompañiaNombre;
        this.Direccion = Direccion;
        this.PaisOrigen = PaisOrigen;

    }
    /* Generar get y set */

    public String getCompañiaNombre() {
        return CompañiaNombre;
    }

    public void setCompañiaNombre(String compañiaNombre) {
        CompañiaNombre = compañiaNombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        PaisOrigen = paisOrigen;
    }

    public Map<String, Obra> getObras() {
        return obras;
    }

    public void setObras(Map<String, Obra> obras) {
        this.obras = obras;
    }

    /* Generar la estructura para mostrar los datos */
    @Override
    public String toString() {
        String datos = "||Nombre: " + CompañiaNombre + " ||Direccion: " + Direccion + " ||Pais: " + PaisOrigen + "||";
        return datos;
    }

}
