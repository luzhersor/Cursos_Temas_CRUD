
package com.luz.cursos.service;

import com.luz.cursos.model.Tema;
import com.luz.cursos.repository.ITemaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TemaService implements ITemaService {
    
    @Autowired
    private ITemaRepository temaRepo;
    
    @Override
    public List<Tema> getTemas() {
        List<Tema> listaTemas = temaRepo.findAll();
        return listaTemas;
    }

    @Override
    public void saveTema(Tema tem) {
        temaRepo.save(tem);
    }

    @Override
    public void deleteTema(Long id) {
        temaRepo.deleteById(id);
    }
    
    @Override
    public Tema findTema(Long id) {
        return temaRepo.findById(id).orElse(null);
    }
    
     @Override
    public void editTema(Tema tem) {
        this.saveTema(tem);
        
    }

    
}
