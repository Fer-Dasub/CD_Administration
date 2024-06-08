package Models.Models.Crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Serializacion.SerializarObjeto;

import Models.Models.CD;
import java.io.Serializable;

public class CDCrud implements Serializable{
    private static final Map<String, CD> Bdcd= new HashMap<>();
    public int agregarCD(CD ccd) throws Exception{
        if(Bdcd.containsKey(ccd.getTitulo())){
            throw new Exception("Ya existe una CD con la Clave "+ccd.getTitulo());
        }
        Bdcd.put(ccd.getTitulo(), ccd);
        SerializarObjeto.serializarObjeto("EstadosCD.Dat", this);
            return Bdcd.size();
        
    }
    public CD buscarCD(String Titulo) throws Exception{
        if(!Bdcd.containsKey(Titulo)){
            throw new Exception ("No existe ninguna CD con la Clave "+Titulo);
        }
        return Bdcd.get(Titulo);
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
            CD ccd = entry.getValue();
            CDs.add(ccd);
        }
        return CDs;
    }
    
    public List<String> ListaNombreCD()throws Exception{
        if(Bdcd.isEmpty()){
            throw new Exception("No existen compañias registradas");
        }
        List<String> NameCD = new ArrayList<>();
        for (Map.Entry<String, CD> entry : Bdcd.entrySet()) {
            String key = entry.getKey();
            NameCD.add(key);
        }
        return NameCD;
    }

    
    public int contarCD(List<Object> listaObjetos){
        return listaObjetos.size();
    }
}
