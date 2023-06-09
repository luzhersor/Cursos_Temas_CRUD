
package com.luz.cursos.service;

import com.luz.cursos.model.Tema;
import java.util.List;



public interface ITemaService {
    
    public List<Tema> getTemas();
    
    public void saveTema(Tema tem);
    
    public Tema findTema(Long id);
    
    public void deleteTema(Long id);
    
    public void editTema(Tema tem);
    
    
}
