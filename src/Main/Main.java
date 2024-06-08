package Main;


import Models.Models.*;
import Models.Models.Crud.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main { 
    public static void main() {
        /* Creacion de los mapas */
        Map<String, CD> cds = new HashMap<>();
        Map<String, Artista> artistaz = new HashMap<>();
        Map<String, Obra> obras = new HashMap<>();
        Map<String, Compañia> compañia = new HashMap<>();
        List<String> prueba2 = new ArrayList<>();
        /*Creacion de los datos */
      
        Compañia DiscosAAA = new Compañia("Discos AAA", "Calle 130", "Argentina");
        Compañia Sony = new Compañia();
        Sony.setCompañiaNombre("Sony");
        Compañia Warner = new Compañia();
        Warner.setCompañiaNombre("Warner");
        Compañia Mproductor = new Compañia();
        Mproductor.setCompañiaNombre("Music Productor");
        CD SSJ = new CD();
        CD TR = new CD();
        CD SS = new CD();
        Artista Paulo = new Artista();
        Paulo.setNombre("Paulo");
        SS.setTitulo("SS");
        TR.setTitulo("TR");
        SSJ.setTitulo("SSJ");
        Artista Duki = new Artista();
        
        Duki.setNombre("Duki");
        Duki.setGeneroDeMusica("Rap/Trap");
        Duki.setNacionalidad("Argentino");
        
        SS.setNocd(4);
        
        
        Cancion Rockstar = new Cancion();
        Rockstar.setTitulo("Rockstar");
        
        
        
        
        SSJ.setNocd(1);
        SS.setClave("wrw");
        TR.setClave("5354");
        SSJ.setCompañias(DiscosAAA);
        SS.setCompañias(Warner);
        TR.setCompañias(Warner);
        Cancion Canela = new Cancion();
        Canela.setTitulo("Canela");
        Canela.setCompañias(DiscosAAA);
        
       
        //SSJ.setCanciones(Canela);
        Rockstar.setCd(SSJ);
        Canela.setCd(SSJ);
        Rockstar.setClave("222");
        SSJ.setClave("222");
        SSJ.setCanciones(Canela);
        SSJ.setCanciones(Rockstar);
        SSJ.setArtistaz(Paulo);
        //SSJ.setArtistaz(Duki);
        Rockstar.setArtista(Duki);
        //SSJ.setCanciones(Rockstar);

       
        
        
        /* CRUD */
        List<Compañia> Lcompañia = new ArrayList<>();
        try {
            CompañiaCrud Datoscompañia = new CompañiaCrud();
            ArtistaCrud Datosartistia = new ArtistaCrud();
            CDCrud Datoscd = new CDCrud();
            CancionCrud Datoscancion = new CancionCrud();
            
            
            Datoscancion.agregarCancion(Rockstar);
            Datosartistia.agregarArtista(Duki);
            Datosartistia.agregarArtista(Paulo);
            Datoscd.agregarCD(SSJ);
            Datoscd.agregarCD(SS);
            Datoscd.agregarCD(TR);
            Datoscancion.agregarCancion(Canela);
            Datoscompañia.agregarCompañia(DiscosAAA);
            Datoscompañia.agregarCompañia(Sony);
            Datoscompañia.agregarCompañia(Warner);
            Datoscompañia.agregarCompañia(Mproductor);
            
            
            /*
            System.out.println("Total de obras "+totalobra+ " Total de canciones "+totalcancion);
            System.out.println("La clave "+ Numero.getClave()+" es la obra "+Numero.getTitulo());
            System.out.println("La cancion "+Nombredelacancion.getCancionNombre()+" hace parte del CD "+Nombredelacancion.getCd());
            */
            
            List<CD> Lcd = Datoscd.ListaDeCDs();
            List<Cancion> Lcancion = Datoscancion.ListaDeCancions();
            List<Artista> Lartista =Datosartistia.ListaDeArtistas();
            
            List<String> Nombrecompañias = Lcompañia.stream().map(Compañia::getCompañiaNombre).collect(Collectors.toList());
            
            
            System.out.println(Lcancion);
            System.out.println(Lcd);
            System.out.println(Lartista);
            /*
            System.out.println(Lcompañia);
            System.out.println(Nombrecompañias);
            /*Datoscd.buscarCD("SSJ");
            List<String> compañiastring = Datoscompañia.ListaNombreCompañias();
            System.out.println(compañiastring);
            String buscador;
            buscador = "Sony";
            List<String> Nombrecompañias = Datoscompañia.ListaNombreCompañias();
            Lcompañia=Datoscompañia.ListaDeCompañias();
            
            List<String> artistasegeg = Datosartistia.ListaNombreArtista();
            List<String> cancionessss = Datoscancion.ListaNombreCanciones();
            System.out.println(cds);*/
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        
       
        
        
        
        /*Inicio de interfaz*/
        
        Home inicio = new Home();
        inicio.setVisible(true);
    }

    
}




