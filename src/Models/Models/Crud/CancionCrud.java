package Models.Models.Crud;

import Models.Models.Cancion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CancionCrud {
    private static final Map<String, Cancion> BdCancions= new HashMap<>();
    public int agregarCancion(Cancion c) throws Exception{
        if(BdCancions.containsKey(c.getTitulo())){
            throw new Exception("Ya existe una Cancion con la Nombre "+c.getTitulo());
        }
        BdCancions.put(c.getTitulo(), c);
            return BdCancions.size();
        
    }
    public Cancion buscarCancion(String Nombre) throws Exception{
        if(!BdCancions.containsKey(Nombre)){
            throw new Exception ("No existe ninguna Cancion con la Nombre "+Nombre);
        }
        return BdCancions.get(Nombre);
    }
    public int actualizaCancion(Cancion c) throws Exception{
        if(!BdCancions.containsKey(c.getTitulo())){
            throw new Exception("La Nombre "+c.getTitulo()+" no esta asociada a ninguna Cancion");
        }
        BdCancions.put(c.getTitulo(), c);
            return BdCancions.size();
        }
    
    public int eliminarCancion(String Nombre) throws Exception{
        if(!BdCancions.containsKey(Nombre)){
            throw new Exception("La Nombre "+Nombre+" no esta asociada a ninguna Cancion");
        }
        BdCancions.remove(Nombre);
        return BdCancions.size();
    }
    
    /*public int eliminarCancionpuesto() throws Exception{
        if(!BdCancions.containsKey(Nombre)){
            throw new Exception("La Nombre "+Nombre+" no esta asociada a ninguna Cancion");
        }
        BdCancions.remove(Nombre);
        return BdCancions.size();
    }*/
    public List<Cancion> ListaDeCancions()throws Exception{
        if(BdCancions.isEmpty()){
            throw new Exception("No hay Cancions registradas");
        }
        List<Cancion> Cancions = new ArrayList<>();
        for (Map.Entry<String, Cancion> entry : BdCancions.entrySet()){
            Cancion c = entry.getValue();
            Cancions.add(c);
        }
        return Cancions;
    }
    
    public List<String> ListaNombreCanciones()throws Exception{
        if(BdCancions.isEmpty()){
            throw new Exception("No existen compañias registradas");
        }
        List<String> NameCan = new ArrayList<>();
        for (Map.Entry<String, Cancion> entry : BdCancions.entrySet()) {
            String key = entry.getKey();
            NameCan.add(key);
        }
        return NameCan;
    }
    public int contarCancion(List<Object> listaObjetos){
        return listaObjetos.size();
    }
}
