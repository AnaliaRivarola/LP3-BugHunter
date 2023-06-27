package lp3.grupal.BugHunter2.Repositorio;

import lp3.grupal.BugHunter2.Models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository <Empresa,Long> {
    
}
