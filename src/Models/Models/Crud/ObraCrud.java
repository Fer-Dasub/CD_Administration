package Models.Models.Crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import Models.Models.Obra;

public class ObraCrud {
    private static final Map<String, Obra> Bdobras= new HashMap<>();
    public int agregarObra(Obra o) throws Exception{
        if(Bdobras.containsKey(o.getClave())){
            throw new Exception("Ya existe una obra con la clave "+o.getClave());
            
        }
        Bdobras.put(o.getClave(), o);
            return Bdobras.size();
        
    }
    public Obra buscarObra(String clave) throws Exception{
        if(!Bdobras.containsKey(clave)){
            throw new Exception ("No existe ninguna obra con la clave "+clave);
        }
        return Bdobras.get(clave);
    }
    public int actualizaObra(Obra o) throws Exception{
        if(!Bdobras.containsKey(o.getClave())){
            throw new Exception("La clave "+o.getClave()+" no esta asociada a ninguna obra");
        }
        Bdobras.put(o.getClave(), o);
            return Bdobras.size();
        }
    
    public int eliminarObra(String clave) throws Exception{
        if(!Bdobras.containsKey(clave)){
            throw new Exception("La clave "+clave+" no esta asociada a ninguna obra");
        }
        Bdobras.remove(clave);
        return Bdobras.size();
    }
    public List<Obra> ListaDeObras()throws Exception{
        if(Bdobras.isEmpty()){
            throw new Exception("No hay obras registradas");
        }
        List<Obra> obras = new ArrayList<>();
        for (Map.Entry<String, Obra> entry : Bdobras.entrySet()){
            Obra o = entry.getValue();
            obras.add(o);
            
        }
        return obras;
    }
    public int contarObra(List<Object> listaObjetos){
        return listaObjetos.size();
    }
}
