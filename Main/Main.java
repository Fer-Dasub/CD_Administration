package Main;

import java.time.LocalDate;
import java.util.logging.Logger;

import Models.*;
import Models.Crud.CancionCrud;
import Models.Crud.ObraCrud;

public class Main {
    public static void main(String[] args) {
        /*Creacion de los datos */
        Compañia DiscosAAA = new Compañia("Discos AAA", "Calle 130", "Argentina");
        CD SSJ = new CD("98", 1, "SSJ", 20000f, "Discos AAA", null);
        Obra Goteo = new Obra("442", "Goteo", 4500f, LocalDate.of(2017, 11, 24), DiscosAAA);
        Cancion Rockstar = new Cancion("Rockstar", 3.22f, SSJ);

        /* CRUD */
        ObraCrud Datosobra = new ObraCrud();
        CancionCrud Datoscancion = new CancionCrud();
        try {
            int totalobra;
            int totalcancion;
            totalcancion = Datoscancion.agregarCancion(Rockstar);
            totalobra = Datosobra.agregarObra(Goteo);
            System.out.println("Total de obras "+totalobra+ " Total de canciones "+totalcancion);
            Obra Numero = Datosobra.buscarObra("442");
            Cancion Nombredelacancion = Datoscancion.buscarCancion("Rockstar");
            System.out.println("La clave "+ Numero.getClave()+" es la obra "+Numero.getTitulo());
            System.out.println("La cancion "+Nombredelacancion.getCancionNombre()+" hace parte del CD "+Nombredelacancion.getCd());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
}
