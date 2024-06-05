package Models.Models.Crud;
import Models.Models.Coleccion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColeccionCrud {
    private static Map<String, Coleccion> Coleccion= new HashMap<>();
    public int agregarColeccion(Coleccion g) throws Exception{
        if(Coleccion.containsKey(g.getClave())){
            throw new Exception("Ya existe una Coleccion con la Nombre "+g.getClave());
        }
        Coleccion.put(g.getClave(), g);
            return Coleccion.size();
        
    }
    public Coleccion buscarColeccion(String Nombre) throws Exception{
        if(!Coleccion.containsKey(Nombre)){
            throw new Exception ("No existe ninguna Coleccion con la Nombre "+Nombre);
        }
        return Coleccion.get(Nombre);
    }
    public int actualizaColeccion(Coleccion g) throws Exception{
        if(!Coleccion.containsKey(g.getClave())){
            throw new Exception("La Nombre "+g.getClave()+" no esta asociada a ninguna Coleccion");
        }
        Coleccion.put(g.getClave(), g);
            return Coleccion.size();
        }
    
    public int eliminarColeccion(String Nombre) throws Exception{
        if(!Coleccion.containsKey(Nombre)){
            throw new Exception("La Nombre "+Nombre+" no esta asociada a ninguna Coleccion");
        }
        Coleccion.remove(Nombre);
        return Coleccion.size();
    }
    public List<Coleccion> ListaDeColeccions()throws Exception{
        if(Coleccion.isEmpty()){
            throw new Exception("No hay Coleccions registradas");
        }
        List<Coleccion> Coleccions = new ArrayList<>();
        for (Map.Entry<String, Coleccion> entry : Coleccion.entrySet()){
            String Nombre = entry.getKey();
            Coleccion g = entry.getValue();
            Coleccions.add(g);
        }
        return Coleccions;
    }
    public int contarColeccion(List<Object> listaObjetos){
        return listaObjetos.size();
    }
}
