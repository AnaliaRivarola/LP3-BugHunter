
package lp3.grupal.BugHunter2.Repositorio;

import lp3.grupal.BugHunter2.Models.Empresa;
import lp3.grupal.BugHunter2.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario,Long> {
    public Usuario findByEmail(String u_correo);
}
