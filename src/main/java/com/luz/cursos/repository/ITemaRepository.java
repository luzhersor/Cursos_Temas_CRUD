
package com.luz.cursos.repository;
import com.luz.cursos.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ITemaRepository extends JpaRepository<Tema, Long> {
    
}
