
package com.luz.cursos.controller;

import com.luz.cursos.model.Tema;
import com.luz.cursos.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {
    
    @Autowired
    private TemaService temaService;
    
    //1 Crear Temas y asociar a un curso
    @PostMapping("/temas/crear")
    public String crearTemas(@RequestBody Tema tema){
        temaService.saveTema(tema);
        
        return "Tema creado exitosamente";
    }
    
    
    //2 modificar los datos de un tema
    @PutMapping("temas/editar")
    public String editTema(@RequestBody Tema tema){
        temaService.saveTema(tema);
        return "Tema editado correctamente";
    }
    
    
}
