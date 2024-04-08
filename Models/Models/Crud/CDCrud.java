package Models.Crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Models.CD;

public class CDCrud {
    private static Map<String, CD> Bdcd= new HashMap<>();
    public int agregarCD(CD ccd) throws Exception{
        if(Bdcd.containsKey(ccd.getClave())){
            throw new Exception("Ya existe una CD con la Clave "+ccd.getClave());
        }
        Bdcd.put(ccd.getClave(), ccd);
            return Bdcd.size();
        
    }
    public CD buscarCD(String Clave) throws Exception{
        if(!Bdcd.containsKey(Clave)){
            throw new Exception ("No existe ninguna CD con la Clave "+Clave);
        }
        return Bdcd.get(Clave);
    }
    public int actualizaCD(CD ccd) throws Exception{
        if(!Bdcd.containsKey(ccd.getClave())){
            throw new Exception("La Clave "+ccd.getClave()+" no esta asociada a ninguna CD");
        }
        Bdcd.put(ccd.getClave(), ccd);
            return Bdcd.size();
        }
    
    public int eliminarCD(String Clave) throws Exception{
        if(!Bdcd.containsKey(Clave)){
            throw new Exception("La Clave "+Clave+" no esta asociada a ninguna CD");
        }
        Bdcd.remove(Clave);
        return Bdcd.size();
    }
    public List<CD> ListaDeCDs()throws Exception{
        if(Bdcd.isEmpty()){
            throw new Exception("No hay CDs registradas");
        }
        List<CD> CDs = new ArrayList<>();
        for (Map.Entry<String, CD> entry : Bdcd.entrySet()){
            String Clave = entry.getKey();
            CD ccd = entry.getValue();
            CDs.add(ccd);
        }
        return CDs;
    }
    public int contarCD(List<Object> listaObjetos){
        return listaObjetos.size();
    }
}
