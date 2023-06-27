package lp3.grupal.BugHunter2.Repositorio;

import lp3.grupal.BugHunter2.Models.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository <Marca,Long> {
    
}
