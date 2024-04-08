package Models.Crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Models.Artista;

public class ArtistaCrud {
    private static Map<String, Artista> Bdartista= new HashMap<>();
    public int agregarArtista(Artista a) throws Exception{
        if(Bdartista.containsKey(a.getNombre())){
            throw new Exception("Ya existe una Artista con la Nombre "+a.getNombre());
        }
        Bdartista.put(a.getNombre(), a);
            return Bdartista.size();
        
    }
    public Artista buscarArtista(String Nombre) throws Exception{
        if(!Bdartista.containsKey(Nombre)){
            throw new Exception ("No existe ninguna Artista con la Nombre "+Nombre);
        }
        return Bdartista.get(Nombre);
    }
    public int actualizaArtista(Artista a) throws Exception{
        if(!Bdartista.containsKey(a.getNombre())){
            throw new Exception("La Nombre "+a.getNombre()+" no esta asociada a ninguna Artista");
        }
        Bdartista.put(a.getNombre(), a);
            return Bdartista.size();
        }
    
    public int eliminarArtista(String Nombre) throws Exception{
        if(!Bdartista.containsKey(Nombre)){
            throw new Exception("La Nombre "+Nombre+" no esta asociada a ninguna Artista");
        }
        Bdartista.remove(Nombre);
        return Bdartista.size();
    }
    public List<Artista> ListaDeArtistas()throws Exception{
        if(Bdartista.isEmpty()){
            throw new Exception("No hay Artistas registradas");
        }
        List<Artista> Artistas = new ArrayList<>();
        for (Map.Entry<String, Artista> entry : Bdartista.entrySet()){
            String Nombre = entry.getKey();
            Artista a = entry.getValue();
            Artistas.add(a);
        }
        return Artistas;
    }
    public int contarArtista(List<Object> listaObjetos){
        return listaObjetos.size();
    }
    
}
