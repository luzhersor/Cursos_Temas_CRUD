
package com.luz.cursos.service;

import com.luz.cursos.dto.CursoTemaDTO;
import com.luz.cursos.model.Curso;
import java.util.List;


public interface ICursoService {
        
    public List<Curso> getCursos();
    
    public void saveCurso(Curso cur);
    
    public Curso findCurso(Long id);
    
    public void deleteCurso(Long id);
    
    public void editCurso(Curso cur);
    
    public List<Curso> getJava();
    
    public CursoTemaDTO getCursoTemario(Long id_curso); 
    
    
}
