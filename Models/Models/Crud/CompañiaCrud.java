package Models.Crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Models.Compañia;

public class CompañiaCrud {
    private static Map<String, Compañia> Bdcompañia= new HashMap<>();
    public int agregarCompañia(Compañia cc) throws Exception{
        if(Bdcompañia.containsKey(cc.getCompañiaNombre())){
            throw new Exception("Ya existe una Compañia con la CompañiaNombre "+cc.getCompañiaNombre());
        }
        Bdcompañia.put(cc.getCompañiaNombre(), cc);
            return Bdcompañia.size();
        
    }
    public Compañia buscarCompañia(String CompañiaNombre) throws Exception{
        if(!Bdcompañia.containsKey(CompañiaNombre)){
            throw new Exception ("No existe ninguna Compañia con la CompañiaNombre "+CompañiaNombre);
        }
        return Bdcompañia.get(CompañiaNombre);
    }
    public int actualizaCompañia(Compañia cc) throws Exception{
        if(!Bdcompañia.containsKey(cc.getCompañiaNombre())){
            throw new Exception("La CompañiaNombre "+cc.getCompañiaNombre()+" no esta asociada a ninguna Compañia");
        }
        Bdcompañia.put(cc.getCompañiaNombre(), cc);
            return Bdcompañia.size();
        }
    
    public int eliminarCompañia(String CompañiaNombre) throws Exception{
        if(!Bdcompañia.containsKey(CompañiaNombre)){
            throw new Exception("La CompañiaNombre "+CompañiaNombre+" no esta asociada a ninguna Compañia");
        }
        Bdcompañia.remove(CompañiaNombre);
        return Bdcompañia.size();
    }
    public List<Compañia> ListaDeCompañias()throws Exception{
        if(Bdcompañia.isEmpty()){
            throw new Exception("No hay Compañias registradas");
        }
        List<Compañia> Compañias = new ArrayList<>();
        for (Map.Entry<String, Compañia> entry : Bdcompañia.entrySet()){
            String CompañiaNombre = entry.getKey();
            Compañia cc = entry.getValue();
            Compañias.add(cc);
        }
        return Compañias;
    }
    public int contarCompañia(List<Object> listaObjetos){
        return listaObjetos.size();
    }
}
