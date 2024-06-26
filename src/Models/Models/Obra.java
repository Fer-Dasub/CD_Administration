package Models.Models;


public class Obra {
    protected String Clave;
    protected String Titulo;
    protected Float Precio;
    protected String FechaCreacion;
    protected Compañia compañias;

    /* Constructor */


    public Obra(String clave, String titulo, Float precio, String fechaCreacion, Compañia compañias) {
        this.Clave = clave;
        this.Titulo = titulo;
        this.Precio = precio;
        this.FechaCreacion = fechaCreacion;
        this.compañias = compañias;
    }
    public Obra(){}

    /* Constriccion de gets y sets */
    public String getClave() {
        return Clave;
    }

    public void setClave(String clave) {
        Clave = clave;
    }

    public Float getPrecio() {
        return Precio;
    }

    public void setPrecio(Float precio) {
        Precio = precio;
    }

    public String getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public Compañia getCompañias() {
        return compañias;
    }

    public void setCompañias(Compañia compañias) {
        this.compañias = compañias;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }
   
    @Override
    public String toString() {
        String datos = "Clave: " + Clave + "||" + "Titulo: " + Titulo + "||" + "Fecha de creacion: " + FechaCreacion
                + "||" + "Precio: " + Precio + "|| \n";
        return datos;
    }
}
