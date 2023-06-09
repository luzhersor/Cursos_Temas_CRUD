
package com.luz.cursos.controller;

import com.luz.cursos.dto.CursoTemaDTO;
import com.luz.cursos.model.Curso;
import com.luz.cursos.service.CursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    
    @Autowired
    private CursoService curService;
    
    
    //1 Obtener todos los cursos
    @GetMapping("/cursos/traer")
    public List<Curso> getCursos(){
        return curService.getCursos();
    }
    
    //2 Crear un nuevo curso 
    @PostMapping("/cursos/crear")
    public String crearCurso(@RequestBody Curso curso){
        curService.saveCurso(curso);
        
        return "Curso editado exitosamente";
    }
    
    // 3 Editar curso
    @PutMapping("/cursos/editar")
    public String editCurso(@RequestBody Curso curso){
        curService.saveCurso(curso);
        return "Curso editado exitosamente";
    }
    
    //4 Obtener todos los cursos con la palabra JAVA
    @GetMapping("/cursos/java")
    public List<Curso> getCursosJava(){
        return curService.getJava();
        
    }
    
    //5 Obtener los temas de un curso
    @GetMapping("/cursos/temas/{id_curso}")
    public CursoTemaDTO temasPorCurso(@PathVariable Long id_curso){
        return curService.getCursoTemario(id_curso);
    }
    
    
    
    
}
