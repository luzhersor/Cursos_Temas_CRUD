
package com.luz.cursos.repository;

import com.luz.cursos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long> {
    
   
}
