package Main;

import Models.*;
import java.lang.NullPointerException;
import java.time.LocalDate;
import java.util.Date;;
public class Main {
    public static void main(String[] args) {
        Compañia DiscosAAA = new Compañia("Discos AAA","Calle 13 # 13","Argentina");
        CD SSJ = new CD();
        LocalDate ssj = LocalDate.of(2017, 11, 24);
        Coleccion Dale_play = new Coleccion("Dale Play Record");
        Artista Duki = new Artista("Duki", "Argentina", "Trap", SSJ);
        Cancion Rockstar = new Cancion("Rockstar", 3.44f, SSJ);
        Cancion Goteo = new Cancion("Goteo", 4.30f, SSJ);
        Cancion Hello_cotto = new Cancion("Hello Cotto", 3.12f, SSJ);
        SSJ.setClave("445");
        SSJ.setTitulo("SSJ");
        SSJ.setPrecio(20000f);
        SSJ.setFechaCreacion(ssj);
        SSJ.setCompañias(DiscosAAA);
        SSJ.setNocd(4);
        SSJ.setColeccion(Dale_play);
        SSJ.addArtista(Duki);
        SSJ.addCancion(Hello_cotto);
        SSJ.addCancion(Rockstar);
        SSJ.addCancion(Goteo);
        System.out.println(SSJ);

    }
}
