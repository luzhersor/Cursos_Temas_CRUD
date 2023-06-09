
package com.luz.cursos.service;

import com.luz.cursos.dto.CursoTemaDTO;
import com.luz.cursos.model.Curso;
import com.luz.cursos.model.Tema;
import com.luz.cursos.repository.ICursoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CursoService implements ICursoService {
    
    @Autowired
    private ICursoRepository cursoRepository;

    @Override
    public List<Curso> getCursos() {
        List<Curso> listaCursos = cursoRepository.findAll();
        return listaCursos;
    }

    @Override
    public void saveCurso(Curso cur) {
        cursoRepository.save(cur);
    }

    @Override
    public void editCurso(Curso cur) {
        this.saveCurso(cur);
    }

    //Importante poner el orElse
    @Override
    public Curso findCurso(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCurso(Long id) {
        cursoRepository.deleteById(id);
    }
    
    
     @Override
    public List<Curso> getJava() {
        List<Curso> listaCursos = this.getCursos();
        List<Curso> listaJava = new ArrayList<Curso>();
        
        for (Curso cur:listaCursos){
            if (cur.getNombre().contains("java")){
                listaJava.add(cur);
            }          
        }     
        return listaJava;
    }

    @Override
    public CursoTemaDTO getCursoTemario(Long id_curso) {
        
        //Instanciando un objeto de tipo CursoTemaDTO
        CursoTemaDTO curTemaDTO = new CursoTemaDTO();
        //Encontrar el curso por el id
        Curso curso = this.findCurso(id_curso);
        //Asignando los atributos que quiero que tenga el objeto a mostrar
        curTemaDTO.setNombreCurso(curso.getNombre());
        //Esta lista el la relacion OneToMany previamente establecida
        curTemaDTO.setListaTemas(curso.getListaTemas());  
       
        
        return curTemaDTO;
    }

  
    
}
