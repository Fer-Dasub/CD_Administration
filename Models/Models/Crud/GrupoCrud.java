package Models.Crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Models.Grupo;

public class GrupoCrud {
    private static Map<String, Grupo> Bdgrupo= new HashMap<>();
    public int agregarGrupo(Grupo gg) throws Exception{
        if(Bdgrupo.containsKey(gg.getNombre())){
            throw new Exception("Ya existe una Grupo con la Nombre "+gg.getNombre());
        }
        Bdgrupo.put(gg.getNombre(), gg);
            return Bdgrupo.size();
        
    }
    public Grupo buscarGrupo(String Nombre) throws Exception{
        if(!Bdgrupo.containsKey(Nombre)){
            throw new Exception ("No existe ninguna Grupo con la Nombre "+Nombre);
        }
        return Bdgrupo.get(Nombre);
    }
    public int actualizaGrupo(Grupo gg) throws Exception{
        if(!Bdgrupo.containsKey(gg.getNombre())){
            throw new Exception("La Nombre "+gg.getNombre()+" no esta asociada a ninguna Grupo");
        }
        Bdgrupo.put(gg.getNombre(), gg);
            return Bdgrupo.size();
        }
    
    public int eliminarGrupo(String Nombre) throws Exception{
        if(!Bdgrupo.containsKey(Nombre)){
            throw new Exception("La Nombre "+Nombre+" no esta asociada a ninguna Grupo");
        }
        Bdgrupo.remove(Nombre);
        return Bdgrupo.size();
    }
    public List<Grupo> ListaDeGrupos()throws Exception{
        if(Bdgrupo.isEmpty()){
            throw new Exception("No hay Grupos registradas");
        }
        List<Grupo> Grupos = new ArrayList<>();
        for (Map.Entry<String, Grupo> entry : Bdgrupo.entrySet()){
            String Nombre = entry.getKey();
            Grupo gg = entry.getValue();
            Grupos.add(gg);
        }
        return Grupos;
    }
    public int contarGrupo(List<Object> listaObjetos){
        return listaObjetos.size();
    }
    
}
